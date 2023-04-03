package jdbc.table;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);

	public void insertMenu() {
		System.out.println("************사원등록************");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("메모:");
		String memo = key.next();
	}

	public void updateMenu() {
		System.out.println("************사원정보수정************");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("포인트:");
		int point = key.nextInt();
		System.out.print("패스워드:");
		String pass = key.next();
	}

	public void deleteMenu() {
		System.out.println("************퇴사하기************");
		System.out.print("아이디:");
		String id = key.next();
	}

	public void selectMenu() {
		System.out.println("************주소검색************");
		System.out.print("주소:");
		String addr = key.next();
	}
	public void login() {
		System.out.println("************로그인************");
		System.out.print("아이디:");
		String id = key.nextLine();
		System.out.print("패스워드:");
		String pass = key.next();
	}
}
