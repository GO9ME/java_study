package api.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prob2 {

	public static void main(String[] args) throws IOException {
		Prob2 p2 = new Prob2();
		p2.printScore("src/data/data2.txt");
	}

	public void printScore(String fileName) throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(fileName));
		String str = "";

		String title = br.readLine();
		String[] title_arr = title.split("/");
		for (String s : title_arr) {
			System.out.print(s + "\t");
		}
		System.out.println("총점");

		while ((str = br.readLine()) != null) {
			int sum = 0;
			String[] arr = str.split("/");

			for (int i = 0; i < arr.length; i++) {
				if (i == 0) {
					System.out.print(arr[i] + "\t");
				} else {
					System.out.print(arr[i] + "\t");
					sum += Integer.parseInt(arr[i]);
				}
			}
			System.out.println(sum + "\t");
		}

		if (br != null)
			br.close();
	}

}
