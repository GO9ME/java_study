package chap04;
import java.util.Scanner;
/*
 Scanner를 이용해서  숫자를 입력 받아 5의 배수인지 체크하세요 (IfExam01.java)
    [출력형식]
     숫자입력:____
     입력한 숫자는 5의 배수입니다.  (입력한 숫자는 5의 배수가 아닙니다.)
*/
public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = key.nextInt();
		
		if (num % 5 == 0) {
			System.out.println("입력한 숫자는 5의 배수입니다.");
		} else {
			System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
		}
		
	}

}
