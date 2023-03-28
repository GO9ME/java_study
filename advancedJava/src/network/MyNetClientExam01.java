package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClientExam01 {
	public static void main(String[] args) {
		Socket socket = null;

		InputStream is = null; // 서버가 보내는 데이터를 읽기 위한 스트림
		DataInputStream dis = null; // 서버가 보내오는 데이터를 읽기 위한 보조스트림

		OutputStream os = null; // 서버에 보낼 데이터를 출력하기 위한 스트림객체
		DataOutputStream dos = null; // 서버에 보낼 데이터를 출력하기 위한 보조 스트림

		String msg = null;
		String ip = null;
		int dan = 0;
		try {
			socket = new Socket("10.10.0.125", 12345);
			ip = socket.getInetAddress().getHostAddress();

			is = socket.getInputStream();
			dis = new DataInputStream(is);

			os = socket.getOutputStream();
			dos = new DataOutputStream(os);

			msg = dis.readUTF();
			System.out.println(msg);

			msg = dis.readUTF();
			dan = 7;
			System.out.println(msg + dan + "단");
			dos.writeInt(dan);

			msg = dis.readUTF();
			System.out.print(msg);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
