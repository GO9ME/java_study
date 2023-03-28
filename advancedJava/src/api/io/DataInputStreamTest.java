package api.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fos = new FileInputStream("src/data/dos.txt");
		DataInputStream dos = new DataInputStream(fos);
	}

}
