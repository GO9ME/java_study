package api.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileCalculator {

	public static void main(String[] args) {
		FileCalculator fc = new FileCalculator();
		String filePath = "C:\\javaweb\\work\\javawork\\advancedJava\\src\\data\\data.txt";
		try {
			fc.addCalculateResult(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader br = null;
		BufferedWriter bw = null;
		br = new BufferedReader(new FileReader(inputFileName));
		bw = new BufferedWriter(new FileWriter(inputFileName, true));
		String data = "";
		int hap = 0;
		int gop = 1;
		while ((data = br.readLine()) != null) {
			int value = Integer.parseInt(data);
			hap += value;
			gop *= value;
		}
		bw.append("\n");
		bw.append(String.valueOf(hap)+"\n");
		bw.append(String.valueOf(gop));
		
		if (br != null) br.close();
		if (bw != null) bw.close();
	}
}