package chap06.oop.constructor;

import java.io.FileInputStream;

public class ConStructorTest01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str1 = new String("java");
		System.out.println(str1);
		
		byte[] data1 = {65,66,67,68,69};
		String str2 = new String(data1);
		System.out.println(str2);
		
		String str3 = new String(data1, 2, 2);
		System.out.println(str3);
		
		char[] data2 = {'0','2','-','4','2','1','-'};
		String str4 = new String(data2);
		System.out.println(str4);
		
		String str5 = new String(data2,0,2);
		System.out.println(str5);
		
		int content = 0;
		FileInputStream fis = new FileInputStream("test.txt");
		while( (content = fis.read()) != -1) {
			System.out.print((char) content);
		}
		fis.close();
	}

}
