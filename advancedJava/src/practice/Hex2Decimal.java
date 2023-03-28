package practice;

import java.util.Scanner;

public class Hex2Decimal {

	/* 이곳에 프로그램을 작성하십시오. */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the hex value ('quit' for exit) : ");
			String value = scan.nextLine();
			if (value.equals("quit")) {
				System.out.println("Bye !!!");
				break;
			}
			System.out.println("hex input : " + value);
			try {
				int hex = Integer.valueOf(value,16);
				System.out.println("decimal output  325: " + hex);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid hex!!!");
			}
			System.out.println("========================");
		}
	}
	
}
