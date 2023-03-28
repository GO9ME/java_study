package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

// byte 단위로 입력을 하기 위한 모든 클래스의 최상위 클래스인 InputStream
// 키보드로 입력한 문자를 읽어서 리턴 
public class InputStreamReaderTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		InputStream in = System.in; // 키보드 입력을 표현하는 상수를 변수에 저장
		double pi = Math.PI;
		PrintStream pw = System.out;

		InputStreamReader ir = null;

		try {
			ir = new InputStreamReader(in);
			while (true) {
				// 2. 데이터 읽기(데이터쓰기)
				// -> 모든 데이터를 읽기위해서 반복작업
				int data = ir.read();
				if (data == 13) {
					break;
				}
				pw.print((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 3. 사용하던 자원을 해제 (자원 반납)
			try {
				if (ir != null)
					ir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
