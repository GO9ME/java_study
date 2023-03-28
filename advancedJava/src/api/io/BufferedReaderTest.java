package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// BufferedRead와 같은 보조스트림은 실제 데이터소스(파일, 키보드입력, 네트워크입력...)와 직접연결이 불가능
// -> 실제 데이터 소스와 연결되는 스트림을 생성한 후에 보조스트림객체를 만들어야한다. 
public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 BufferedReader로 읽기
//		FileReader fr = new FileReader("src/data/test.txt");
//		BufferedReader br = new BufferedReader(fr);

//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br2 = new BufferedReader(isr);

		// 버퍼라는 임시 저장소를 이용해서 입력처리
		BufferedReader br = new BufferedReader(new FileReader("src/data/test.txt"));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		long start = System.nanoTime();
		while (true) {
			String line = br.readLine(); // 라인 한줄 씩 read 
			if (line == null) {
				break;
			}
			System.out.println(line);
			count++;
		}
		long end = System.nanoTime();
		System.out.println("실행횟수=>" + count);
		System.out.println("실행시간=>" + (end - start));
		br.close();

	}

}
