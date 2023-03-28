package chap11.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// throws를 이용해서 예외를 처리
// -> 예외가 직접적으로 발생한 곳에서 처리하지 않고 호출한 곳에서 예외를 처리하도록 구현
public class ThrowsTest01 {
	// 1. 예외가 발생한 곳에서 처리하기
	//		-> 호출한 곳에서 예외가 발생된 것을 알 수 없다. 예외 발생되었을 때 처리할 수 없다.
	// 		-> 예외가 발생되면 예외에 대한 처리가 모두 끝난 상태로 실행이 디ㅗ므로 호출한 곳에서 처리할 수 없다.
	public void test(String filename)  {
		try {
			FileInputStream fis = new FileInputStream(filename);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외처리 종료");
		}
	}
	// 2. 예외가 발생된 곳에서 처리하지 않고 호출한 곳에서 처리하도록 예외를 던짐
	// 메소드 선언분에 명시
	// 메소드명() throws 예외클래스명1, 예외클래스명2....{}
	public void test2(String filename) throws FileNotFoundException{
		FileInputStream fis = new FileInputStream(filename);
	}

	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		//A위치에서 호출
		obj.test("test2.txt");
		
		//B위치에서 호출
		obj.test("test3.txt"); // test 메소드는 예외가 발생한 메소드 내부에서 Exception에 대한 처리를 했기 때문에 호출하는 곳에서 모두 동일한 방법으로 처리
	
		//A위치
		try {
			obj.test2("test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. 다른파일을 선택할까요?");
			// TODO: handle exception
		}
		
		//B위치
		try {
			obj.test2("test3.txt");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("파일을 찾을 수 없습니다. 프로그램을 종료합니다.");
		}
	
	}
	

}
