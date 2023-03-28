package chap11.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// 프로그램 실행 중에 예외가 발생하는 상황
class Super {

}

class Sub extends Super {

}

public class ExceptionTest01 {
	public static void main(String[] args) {
		// 1. 개발자가 실수할 수 있는 부분
		System.out.println("*************프로그램시작************");
//		System.out.println(10/0);	// ArithmeticException
//		System.out.println(args[0]); // ArrayIndexOutOfBoundsException
		String str = null;
//		str.length();	//NullPointerException
		Super obj = new Super();
//		Sub obj1 = (Sub) obj; //ClassCastException
		// 2. 외부요인이나 사용자의 실수로 발생할 수 있는 오류
		Scanner key = new Scanner(System.in);
		int data = key.nextInt(); // InputMismatchException

		// 3. API 에서 문법적으로 예외처리를 요구하는 경우
		// => 메소드 선언부에 XXXexception을 throws하는 것은 이 메소드를 사용하면서 XXXexception이 발생될 수 있다는 것을 의미
		// => RuntimeException의 하위는 문법적으로 제약하지 않음. 그러나 RuntimeExcpetion의 하위가 아닌 경우는 컴파일
		// 오류 발생 , 예외처리를 해야한다.
		// => 예외발생할 가능성이 있는 코드이므로 무조건 예외처리를 해야한다

		try {
			FileReader f = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // FileNotFoundException

		Integer.parseInt("1234");

	}
}
