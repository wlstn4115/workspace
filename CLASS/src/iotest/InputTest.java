package iotest;

import java.io.*;

public class InputTest 
{
	public static void main(String[] args) 
	{
		
		String abc = args[0];
		System.out.println(abc);
		//InputStream : ǥ���Է���ġ�� �߻�ȭ�� class
		InputStream inputStream = System.in;
		
		System.out.println("�Է��� ��ٸ��ϴ�...");

		try
		{
			//���� �о���̴� ���� loop ����
			while(true) {
				
				//1.java.io �� ������ �� �ִ�
				int i = inputStream.read();
				char c = (char) i;

				//2.java.io �� FIFO ������
				//Q... �� �Է��� ���� ������ �ι��� �� ������!!!!
				System.out.println("�Է��Ͻ� ��: "+c);

				//x�� �ԷµǸ� ����
				if(c=='x') {
					inputStream.close();
					break;
				}
				//�ѱ��Է½� ���� char���� ������ �Ѱ��� �����ϱ�~~ �ѱ��� char 2�� �ʿ���
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}