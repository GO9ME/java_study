package chap05;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String people = null;
		boolean flag = true;
		
		while (flag) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			
			System.out.print("선택>");
			String num = scan.nextLine();
			switch (num) {
			case "1" :
				System.out.print("학생수:");
				people = scan.nextLine();
				int[] scores = new int[(int) people];
				break;
			case "2":
				for (int i = 0 ; i < scores.length; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = scan.nextInt();
				}
				break;
			case "3":
				for (int i = 0 ; i < scores.length; i++) {
					System.out.print("scores["+i+"]>"+ scores[i]);
				}
				break;
			case "4":
				break;
			case "5":
				flag = false;
				break;
			default:
				break;
			}
		}
	}

}
