package chap11.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch 사용하기
// 예외처리 : try ~ catch ~ catch ....
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			// 예외 발생 가능성이 있는 코드
			System.out.println("시작");
			System.out.print("숫자입력:");
			int num1 = key.nextInt();
			System.out.print("나눌 숫자 입력:");
			int num2 = key.nextInt();
			System.out.println("결과=>"+(num1/num2));
			System.out.println("종료");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눴음...");
		} catch (InputMismatchException e) {
			System.out.println("사용자가 문자를 입력했음");
		}
		}
}
