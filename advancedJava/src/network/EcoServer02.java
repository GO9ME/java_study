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
		BufferedReader keyin = null;

		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 대기 ...");

			while (true) {
				String recvMsg = "";
				String sendMsg = "";
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));

				if (socket != null) {
					sendMsg = "안녕하세요 클라이언트님";
					out.println(sendMsg);
				}
				// 클라이언트가 보내는 데이터를 계속 읽어서 클라이언트에게 다시 보내주는 작업을 처리
				while (true) {
					recvMsg = in.readLine();
					System.out.println("클라이언트 >>> " + recvMsg);
					sendMsg = keyin.readLine();
					out.println(sendMsg);
					

//					if (recvMsg.equals("안녕하세요?") || recvMsg.equals("하이") ) {
//						sendMsg = clientInfo.getHostAddress() + "님 반가워요";
//					} else if (recvMsg.equals("오늘 날짜는")) {
//						SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//						Date now = n	ew Date();
//						sendMsg = "오늘 날짜는 " + sdf.format(now) + " 입니다";
//					} else {
//						sendMsg = clientInfo.getHostAddress() + "님 어여 가~~";
//					}
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
