package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClientExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		String checkNum = null;
		try {
			socket = new Socket("10.10.0.125", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);

			String data1 = in.readLine();
			int dan = Integer.parseInt(in.readLine());

			String result = "";
			for (int i = 1; i <= 9; i++) {
				result = dan + " x " + i + " = " + (dan * i) + "\n";
				System.out.print(result);
			}
			if (dan % 2 == 0 ) {
				checkNum = "짝수";
			} else {
				checkNum = "홀수";
			}
			out.println(checkNum);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
