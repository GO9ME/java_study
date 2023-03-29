package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;

		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 대기 ...");
			while (true) {
				Socket socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress() + " 입장");

				ServerSenderThread send = new ServerSenderThread(socket);
				send.start();
				ServerReceiverThread recv = new ServerReceiverThread(socket);
				recv.start();
				
				System.out.println("서버 채팅 시작");
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (server != null)
					server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
