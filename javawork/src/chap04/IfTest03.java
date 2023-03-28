package chap04;

import java.util.Scanner;

// if문 중첩하기
public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IfTest02와 동일한 작업을 처리
		// 단, jumsu 0보다 작거나 100보다 큰 값을 입력받으면 "잘못입력"

		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력:");
		int jumsu = scan.nextInt();
		String result;
		
		if (jumsu < 0 | jumsu > 100) {
			System.out.println("잘못입력");
		} else {
			if (jumsu >= 90) {
				result = "pass";
			} else {
				result = "fail";
			}

			System.out.println("점수는 " + jumsu + "점이고 , " + result);
		}
		
		if (jumsu >= 0 & jumsu <= 100) {
			if (jumsu >= 90) {
				result = "pass";
			} else {
				result = "fail";
			}

			System.out.println("점수는 " + jumsu + "점이고 , " + result);
		} else {
			System.out.println("점수가 잘못 입력됐습니다.");
		}
	}

}
