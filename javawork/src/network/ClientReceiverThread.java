package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientReceiverThread implements Runnable {
	BufferedReader in = null;
	Socket socket = null;

	public ClientReceiverThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ClientReceiverThread 시작");
		String recvMsg;
		while (true) {
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				recvMsg = in.readLine();
				if ( recvMsg == null || recvMsg.equals("quit") || this.socket.isClosed()) {
					System.out.println("ClientReceiverThread 종료");
					break;
				}
				System.out.println("Server >>> " + recvMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			if (in != null)
				in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
