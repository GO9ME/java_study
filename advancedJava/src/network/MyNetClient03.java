package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			socket = new Socket("10.10.0.125", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out= new PrintWriter(socket.getOutputStream(),true);
			
			String data1 = in.readLine();
			String data2 = in .readLine();
			
			out.println("7");
//			out.flush();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
