package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// src/data/InputStream.java 를 읽어서 파일을 copy하는 프로그램을 작성하에ㅛ
		// 1. 출력파일명 : output.txt
		// 2. 예외처리를 모두 적용하세요
		BufferedReader br = null;
		FileWriter fw = null;
		String addr = "src/data/";
		try {
			br = new BufferedReader(new FileReader(addr + "InputStreamTest.java"));
			fw = new FileWriter(addr + "output.txt");
			String data = "";
			while ((data = br.readLine()) != null) {
				fw.write(data+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null ) br.close();
				if ( fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
