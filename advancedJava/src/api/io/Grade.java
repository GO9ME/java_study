package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Grade {

	public static void main(String args[]) {

		Grade grade = new Grade();

		String fileName = "score.txt";
		grade.printGrade(fileName);

	}

	public void printGrade(String fileName) {

		/* 이곳에 프로그램을 완성하십시오. */
		BufferedReader br = null;
		ArrayList<String> arr = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader("src/data/" + fileName));
			String data = "";
			while ((data = br.readLine()) != null) {
				arr.add(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		int size = arr.size();
		int sum = 0;
		for (String s : arr) {
			String[] str = s.split(",");
			System.out.printf("%s의 점수는 %s점 입니다\n", str[0], str[1]);
			sum += Integer.parseInt(str[1]);
		}
		System.out.printf("모두의 총점은 %d점 입니다.\n", sum);
		System.out.printf("모두의 평균은 %d점 입니다.", sum / size);

	}

}