package chap06;

public class MyMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****프로그램 시작*****");
		MyMethod obj = new MyMethod();
//		obj.display();
//		obj.display("★");

		obj.display("♣", 5);
		obj.display("★", 10);

		int result = obj.sum(100, 300);
		System.out.println(result);
	}

}
