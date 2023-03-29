package chap04;

import java.util.Scanner;

/*
 * 다중if, if문을 중첩
0 ~ 59 : F학점
60 ~ 69 : D학점
70 ~ 79 : C학점
80 ~ 89 : B학점
90 ~ 100 : A학점
110 or -40 : 잘못입력

[출력형식]
점수:___, ___학점
1) Scanner클래스를 이용해서 입력받도록 
2) 0부터 100까지 입력되면 학점평가, 외의 숫자는 잘못입력으로 출력되도록 구현
*/
public class MultiIfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("점수입력:");
		int num = key.nextInt();
		String result = "점수:" + num + ", ";
		String score;

		if (num >= 0 & num <= 100) {
			if (num >= 90) {
				score = "A";
			} else if (num >= 80) {
				score = "B";
			} else if (num >= 70) {
				score = "C";
			} else if (num >= 60) {
				score = "D";
			} else {
				score = "F";
			}
			result = result + score + "학점";
			System.out.println(result);
		} else {
			System.out.println("잘못입력");
		}
	}

}
