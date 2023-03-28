package data;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

// byte 단위로 입력을 하기 위한 모든 클래스의 최상위 클래스인 InputStream
// 키보드로 입력한 문자를 읽어서 리턴 
public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in; // 키보드 입력을 표현하는 상수를 변수에 저장
		double pi = Math.PI;
		PrintStream pw = System.out;
		try {
			while (true) {
				int data = in.read();
				if ( data == 13) {
					break; 
				}
				pw.print((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
