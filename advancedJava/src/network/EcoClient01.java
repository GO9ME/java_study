package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 키보드로 입력한 내용을 서버에 보내기
public class EcoClient01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			socket = new Socket("10.10.0.125", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = "";
			String recvMsg = "";
			while((sendMsg = keyin.readLine())!= null ) {
				out.println(sendMsg);
				recvMsg = in.readLine();
				System.out.println("서버 >> " + recvMsg);
				
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
