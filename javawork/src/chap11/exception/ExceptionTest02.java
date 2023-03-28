package chap11.exception;

// 자바에서 예외처리하는 방법 : try~catch 블럭
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println("try 블럭시작");
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("에러메세지=> : "+e.getMessage());
			
		}
	}
}
