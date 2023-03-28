package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
// BufferedReader로 읽고 PrintWriter로 출력
public class PrintWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// src/data/InputStream.java 를 읽어서 파일을 copy하는 프로그램을 작성하에ㅛ
		// 1. 출력파일명 : output.txt
		// 2. 예외처리를 모두 적용하세요
		BufferedReader br = null;
		PrintWriter pw = null;
		String addr = "src/data/";
		try {
			br = new BufferedReader(new FileReader(addr + "InputStreamTest.java"));
			pw = new PrintWriter(addr + "output2.txt");
			String data = "";
			while ((data = br.readLine()) != null) {
				pw.write(data+"\n");
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
				if ( pw != null) pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
