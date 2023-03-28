package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 파일 입출력을 위한 작업
// => FileInputStream(byte단위 입출력)
public class FileInputStreamTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 1. 파일열기
			fis = new FileInputStream("src/data/test.txt");
			// 2. 파일 엑세스
			while (true) {
				int data = fis.read();
				if ( data == -1 ){
					break;
				}
				System.out.print((char) data);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 중에 오류가 발생 ...");
		} finally {
			// 3. 파일 닫기 - 자원반납
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
