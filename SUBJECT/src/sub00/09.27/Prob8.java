public class Prob8
{
	public static void main(String[] args) 
	{
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("=== ���ڿ� ó�� ��� ===");
		for(int i=0; i<strs.length; i++){
			System.out.println(strs[i]);
		}
	}

	private static String[] stringSplit(String str1, String str2){
		int count = 0;
		int index = 0;

		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) == str2.charAt(0))
				count++;
		}

		String[] strs = new String[count+1];

		for(int i=0; i<count+1;i++)
		{
			strs[i] = "";
			for(int j=index; j<str1.length(); j++){
				if(str1.charAt(j) == str2.charAt(0)){
					index = j+1;
					break;
				}else{
					strs[i] += str1.charAt(j);
				}
			}
		}
		return strs;
	}
}

