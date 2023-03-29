package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSendThread implements Runnable {
	BufferedReader in = null;
	PrintWriter out = null;
	Socket socket = null;

	public ClientSendThread(Socket socket) {
		super();
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ClientSendThread 시작");
		String sendMsg;
		while (true) {
			try {
				sendMsg = in.readLine();
				out.println(sendMsg);
				if (sendMsg.equals("quit") || this.socket.isClosed()) {
					System.out.println("ClientSendThread 종료");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
