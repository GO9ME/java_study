package chap04;

import java.util.Scanner;

public class Prob3 {
	public static void main(String args[]) {
		int number = 0;

		System.out.print("2 ~ 100사이의 정수를 입력하세요.  : ");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();

		/* 이곳에 프로그램을 완성하십시오. */
		int count = 0;
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				count = count + 1;
			}
		}

		if (count == 1) {
			System.out.println(number + "는(은) 소수입니다.");
		} else {
			System.out.println(number + "는(은) 소수가 아닙니다.");
		}
		
		keyboard.close();
	}
}
