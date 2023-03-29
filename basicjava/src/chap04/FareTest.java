package chap04;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("-----Menu------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");

		System.out.println("---------------------");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("---------------------");
		int menu = scan.nextInt();

		System.out.println("사용량을 입력하세요=>");
		int amount = scan.nextInt();

		int price = 0;
		double totalPrice = 0;

		switch (menu) {
		case 1:
			price = amount * 50;
			break;
		case 2:
			price = amount * 45;
			break;
		case 3:
			price = amount * 30;
			break;
		default:
			break;
		}
		totalPrice = price + (price * 0.05);

		System.out.println("=====================");
		System.out.println("사용자 코드:" + menu);
		System.out.println("사용 요금:" + price);
		System.out.println("총수도 요금:" + totalPrice);
		System.out.println("=====================");
		
		scan.close();
	}

}
