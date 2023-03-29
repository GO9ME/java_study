package chap04;
import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("점수입력:");
		int num = key.nextInt();
		String result = "점수:" + num + ", ";
		String score;

		if (num >= 0 & num <= 100) {
			switch (num / 10) {
			case 10:
			case 9:
				score = "A";
				break;
			case 8:
				score = "B";
				break;
			case 7:
				score = "C";
				break;
			case 6:
				score = "D";
				break;
			default:
				score = "F";
			}
			result = result + score + "학점";
			System.out.println(result);
		} else {
			System.out.println("잘못입력");
		}
	}

}
