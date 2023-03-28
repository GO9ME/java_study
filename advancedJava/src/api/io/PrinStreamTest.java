package api.io;

import java.io.PrintStream;

public class PrinStreamTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream("src/data/p_out.txt");
		ps.println(3);
		ps.close();
		
	}

}
