package chap04;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int total = 0;
		boolean check = true;
		
		while (check) {
			
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");

			System.out.print("선택>");
			String choice = scan.nextLine();

			switch (choice) {
			case "1":
				System.out.print("예금액>");
				total = total + scan.nextInt();
				break;
			case "2":
				System.out.print("출금액>");
				total = total - scan.nextInt();
				break;
			case "3":
				System.out.print("잔고>" + total);
				break;
			case "4":
				System.out.print("프로그램 종료");
				check = false;
				break;
			default:
				break;
			}
			choice = scan.nextLine();
			
//			System.out.print("선택>");
//			int choice = scan.nextInt();
//
//			switch (choice) {
//			case 1:
//				System.out.print("예금액>");
//				total = total + scan.nextInt();
//				break;
//			case 2:
//				System.out.print("출금액>");
//				total = total - scan.nextInt();
//				break;
//			case 3:
//				System.out.print("잔고>" + total);
//				break;
//			case 4:
//				System.out.print("프로그램 종료");
//				check = false;
//				break;
//			default:
//				break;
//			}
			
			System.out.println();

		}

	}

}
