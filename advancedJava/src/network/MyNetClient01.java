package network;

import java.io.IOException;
import java.net.Socket;

public class MyNetClient01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Socket 객체를 만들면 매개변수로 전달한 IP주소로 접속한다.
			// -> 생성자메소드에서 해당ip와 port정보를 이용해서 서버에 접속하는 작업을 처리
			Socket socket = new Socket("10.10.0.201",50000);
			System.out.println("server 접속 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
