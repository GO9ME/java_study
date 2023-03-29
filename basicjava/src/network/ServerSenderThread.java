package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSenderThread extends Thread {
	BufferedReader in = null;
	PrintWriter out = null;
	Socket socket = null;

	public ServerSenderThread(Socket socket) {
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
		System.out.println("ServerSenderThread 시작");
		String sendMsg;
		while (true) {
			try {
				sendMsg = in.readLine();
				out.println(sendMsg);
				if (sendMsg.equals("quit")) {
					System.out.println("ServerSenderThread 종료");
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
			if (socket != null)
				socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
