package chap04;

import java.util.Scanner;

public class ForExam_GuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("단x`:");
		int dan = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		scan.close();
	}

}
