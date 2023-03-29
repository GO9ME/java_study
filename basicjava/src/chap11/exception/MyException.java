package chap11.exception;
// 사용자 정의 예외클래스 만들기
// MyException 을 Exception 클래스로 만들기 위해 상속
public class MyException extends Exception{
	public MyException(String msg) {
		super(msg); // Exception 클래스에 메세지를 전달
	}
}
