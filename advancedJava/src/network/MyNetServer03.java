package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
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
				out.println("출력할 단 : ");
//				out.flush();
				
				int dan = Integer.parseInt(in.readLine());
				System.out.println("클라이언트가 입력한 단은 " + dan + "입니다");
				String result = "";
				for (int i = 1 ; i <= 9 ; i++) {
					result += dan + " x " + i + " = " +( dan*i) + "\n";
				}
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
	}

}
