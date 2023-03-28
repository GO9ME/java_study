package api.io;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter
// FileWriter는 문자단위로 출력
public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 파일출력의 기본 덮어쓰기 
		// 1. 파일 열기
		// => 파일이 존재하지 않으면 파일을 생성해서 사용
		FileWriter fw = new FileWriter("src/data/result.txt",true);
		// 파일 엑세스
		fw.write(97);
		fw.write("안녕\n");
		fw.write(98);
		fw.write("안녕\n");
		// 
		fw.flush();
		// 파일 닫기
		fw.close();
		
		
	}

}
