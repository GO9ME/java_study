package chap04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수 입력받고 90점이상은 pass, 나머지는 fail
		// [출력형식]
		// 점수는 __점이고, __ 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = scan.nextInt();
		String result;
		
		if (score >= 90) {
			result = "pass";
		} else {
			result = "fail";
		}
		
		System.out.println("점수는 " + score + "점이고 , " + result);
	}

}
