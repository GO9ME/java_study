package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServerExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		int dan = 0;
		try {
			server = new ServerSocket(12345);
			System.out.println("접속대기중...");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress()+"님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(),true);
				
				out.println(clientInfo.getHostAddress() + "님 접속을 환영합니다.");
				dan = (int)( Math.random() * (9 - 2) ) + 2;
				out.println(dan);
				System.out.println("서버가 입력한 단은 " + dan + "입니다");
				String data = in.readLine();
				System.out.println("보낸 수 홀수/짝수 결과는 : " + data);
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}

}
