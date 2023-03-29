package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServerExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket clientSocket = null;
		InputStream is= null; // 클라이언트가 보내는 데이터를 읽기 위한 스트림
		DataInputStream dis = null; // 클라이언트가 보내오는 데이터를 읽기 위한 보조스트림
		
		OutputStream os = null; // 클라이언트에 보낼 데이터를 출력하기 위한 스트림객체
		DataOutputStream dos = null; // 클라이언트에 보낼 데이터를 출력하기 위한 보조 스트림
		String ip = null;
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라리언트의 접속을 기다림 .... ");
			while (true) {
				clientSocket = server.accept();
				ip = clientSocket.getInetAddress().getHostAddress();
				
				is = clientSocket.getInputStream();
				dis = new DataInputStream(is);
			
				os = clientSocket.getOutputStream();
				dos = new DataOutputStream(os);
				
				dos.writeUTF(ip + "님 접속을 환영합니다.");
				dos.writeUTF("출력할 단 : ");
				
				int dan = dis.readInt();
				for (int i = 1 ; i <= 9 ; i++) {
					System.out.println( dan + " x " + i + " = " +( dan*i));
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
