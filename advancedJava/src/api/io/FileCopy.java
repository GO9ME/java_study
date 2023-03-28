package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// src/data/InputStream.java 를 읽어서 파일을 copy하는 프로그램을 작성하에ㅛ
		// 1. 출력파일명 : output.txt
		// 2. 예외처리를 모두 적용하세요
		FileReader fis = null;
		FileWriter fw = null;
		String addr = "src/data/";
		int data;
		try {
			fis = new FileReader(addr + "InputStreamTest.java");
			fw = new FileWriter(addr + "output.txt");
			while ((data = fis.read()) != -1) {
				data = (char)data;
				fw.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null ) fis.close();
				if ( fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
