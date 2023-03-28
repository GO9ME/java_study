package basic;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int data = key.nextInt();	//nextXXX 메소도는 space bar나 enter 전의 입력 값만 읽는다.
		System.out.println("입력한숫자:"+data);

//		System.out.print("숫자입력:");
//		int data2 = key.nextInt();
//		System.out.println("입력한숫자:"+data2);

		System.out.print("문장입력:");
		//nextline 한 문장을 모두 읽기
		key.nextLine();
		String line = key.nextLine();
		System.out.println(line);
		
		
	}

}
