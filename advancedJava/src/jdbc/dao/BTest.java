package jdbc.dao;

import jdbc.basic.Factory;

public class BTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("다른 코드드 ... 1");
		System.out.println("다른 코드드 ... 2");
		System.out.println("다른 코드드 ... 3");
		System.out.println("다른 코드드 ... 4");
		
		Factory factory = new Factory();
		CustomerDAO dao = factory.getDAO();
		dao.insert(null, null, null, null, null);
		
		System.out.println("다른 코드드 ... 1");
		System.out.println("다른 코드드 ... 2");
		System.out.println("다른 코드드 ... 3");
		System.out.println("다른 코드드 ... 4");
		
		dao.insert(null, null, null, null, null);
		
	}

}
