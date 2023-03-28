package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;

		while ((str = br.readLine()) != null) {
			sb.append((str.charAt(0) - 48) + (str.charAt(2) - 48) + "\n");
		}

		System.out.print(sb);
	}
}
