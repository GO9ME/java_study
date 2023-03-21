package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SingleChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;

		try {
			socket = new Socket("121.171.194.44", 12345);
			Thread recv = new Thread(new ClientReceiverThread(socket));
			recv.start();

			Thread send = new Thread(new ClientSendThread(socket));
			send.start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
