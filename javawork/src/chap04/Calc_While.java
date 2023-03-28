package chap04;

import java.util.Scanner;

public class Calc_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		while (true) {
			System.out.println("*******미니계산기********");
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("3. 뺴기");
			System.out.println("4. 나누기");
			System.out.println("5. 종료");

			System.out.print("연산자를 선택하세요.");
			int num = key.nextInt();
			
			if (num == 5){
				System.out.println("종료");
				break;
			}

			System.out.print("숫자를 입력하세요 ");
			int num1 = key.nextInt();
			int num2 = key.nextInt();

			int result = 0;

			if (num == 1) {
				result = num1 + num2;
			} else if (num == 2) {
				result = num1 * num2;
			} else if (num == 3) {
				result = num1 - num2;
			} else if (num == 4) {
				result = num1 / num2;
			} 
			
			System.out.println("계산결과=>" + result);
			System.out.println("========================================");
		}
	}

}
