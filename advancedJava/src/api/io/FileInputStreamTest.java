package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일 입출력을 위한 작업
// => FileInputStream(byte단위 입출력)
public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			// 1. API 생성
			// -> 파일을 자바 프로그램 안에서 사용하기 위해서는 OS와 통신하며 사용할 파일을 먼저 open해야 한다.
			// -> FileInputSTream생성자 내부에서 그러한 작업을 처리 
			
			// 1) ㅍ일경로를 주지 않고 파일명만 입력하는 경우 기본위치에서 찾음
			// -> 기본위치 : 프로젝트 폴더
			// 2. 파일 엑세스
			FileInputStream fis = new FileInputStream("src/data/test.txt");
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 중에 오류가 발생 ...");
		} finally {
			//3. 파일 닫기 - 자원반납
			
		}
	}
}
