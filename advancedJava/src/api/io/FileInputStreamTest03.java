package api.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/data/test.txt");
		byte[] bytearr = new byte[100];
		int count = 0;
		while (true) {
			// 바이트 배열을 매개변수로 전달하면 byte[]배열의 개수만큼 읽고 byte[]에 저장 read 메소드는 읽은 byte수를 리턴
			int data = fis.read(bytearr);
			if (data == -1) {
				break;
			}

			System.out.println("읽은 바이트 수 : " + data);
			for (int i = 0; i < data; i++) {
				System.out.print((char) bytearr[i]);
			}
			count++;

		}
		System.out.println();
		System.out.println("실행횟수=>" + count);
		fis.close();
	}

}
