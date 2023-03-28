package chap04;

import java.util.Scanner;

/*
 * 2. 숫자를 Scanner 를 통해 입력 받은 후 양수와 음수를 판별한 후 짝수와 홀수를 구분할 수 있도록 작업하세요(IfExam02.java)
   [출력형식]
   숫자를 입력하세요:______
    ex) 10
           양수이면서 짝수
            7
           양수이면서 홀수
            -1
            음수
*/
public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = key.nextInt();
		
		if (num >= 0) {
			if (num % 2 == 0) {
				System.out.println("양수이면서 짝수");
 			} else {
 				System.out.println("양수이면서 홀수");
 			}
		} else {
			System.out.println("음수");
		}
	}

}
