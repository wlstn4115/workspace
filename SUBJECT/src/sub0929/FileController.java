package sub0929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

public class FileController {
	public void reverseLine(String inputFileName, String outputFileName) throws Exception{
		Vector<String> v = new Vector<String>();
		BufferedReader br = null;
		BufferedWriter  bw = null;
		br = new BufferedReader(new FileReader(inputFileName));
		bw = new BufferedWriter(new FileWriter(outputFileName));
		
		String str =null;
		while((str=br.readLine()) != null) {
			v.add(0,str);	
		}
		
		
		while(v.size() != 0) {
			bw.write(v.get(0));
			v.remove(0);
			bw.newLine();
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);
	}

}
