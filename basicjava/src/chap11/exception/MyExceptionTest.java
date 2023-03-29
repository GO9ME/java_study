package chap11.exception;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("프로그램시작");
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		System.out.print("숫자입력:");
		int num = key.nextInt();
		// num이 홀수가 입력되면 예외로 처리 - JVM 이 인식하는 예외는 아니지만 예외를 발생시킨다.
		// throw new Exception 클래스()
		if( num % 2 == 1) {
			try {
				throw new MyException("홀수가 입력됐습니다.(error~~~~~)");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외처리완료");
				System.out.println("=========================");
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("짝수");
		}
	
	
	
	}
}
