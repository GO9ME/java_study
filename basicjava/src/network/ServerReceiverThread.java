package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiverThread extends Thread {
	BufferedReader in = null;
	Socket socket = null;

	public ServerReceiverThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ServerReceiverThread 시작");
		String recvMsg;
		while (true) {
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				recvMsg = in.readLine();
				if ( recvMsg == null || recvMsg.equals("quit")) {
					System.out.println("ServerReceiverThread 종료");
					break;
				}
				System.out.println("client >>> " + recvMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			if (in != null)
				in.close();
			if (socket != null)
				socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
