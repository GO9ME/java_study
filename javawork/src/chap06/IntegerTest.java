package chap06;

// 문자열을 숫자로 변경하는 방법
// Integer클래스를 parseInt 메소드를 이용하면 String 데이터를 Int데이터로 변경할 수 있다.
public class IntegerTest {

	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println(sum);
	}

}
