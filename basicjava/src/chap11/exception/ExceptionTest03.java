package chap11.exception;

import java.util.Scanner;

// while문에 Exception 처리
public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i = 10;
		while (i <= 13) {
			System.out.print("나누기할 숫자:");
			int num = key.nextInt();
			try {
				System.out.println("값=>" + i / num);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
