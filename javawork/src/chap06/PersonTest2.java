package chap06;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2();

		p1.setName("제이홉");
		System.out.println("성명:" + p1.getName());

		p1.setAddr("서울시");
		System.out.println("지역:" + p1.getAddr());

		p1.setAge(20);
		System.out.println("나이:" + p1.getAge());

		System.out.println("==========================");
		Person2 p2 = new Person2();

		p2.setName("지민");
		System.out.println("성명:" + p2.getName());

		p2.setAddr("인천시");
		System.out.println("지역:" + p2.getAddr());

		p2.setAge(25);
		System.out.println("나이:" + p2.getAge());
	}
}
