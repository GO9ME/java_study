package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EcoServer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 대기 ...");

			while (true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				// 클라이언트가 보내는 데이터를 계속 읽어서 클라이언트에게 다시 보내주는 작업을 처리
				String recvMsg = "";
				String sendMsg = "";
				while (true) {
					recvMsg = in.readLine();
					if (recvMsg.equals("안녕하세요?") || recvMsg.equals("하이") ) {
						sendMsg = clientInfo.getHostAddress() + "님 반가워요";
					} else if (recvMsg.equals("오늘 날짜는")) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
						Date now = new Date();
						sendMsg = "오늘 날짜는 " + sdf.format(now) + " 입니다";
					} else {
						sendMsg = clientInfo.getHostAddress() + "님 어여 가~~";
					}
					out.println(sendMsg);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
