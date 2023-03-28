package chap11.exception;

// 예외처리 : try ~ catch ~ finally
public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			System.out.println("프로그램시작");
			System.out.println("디비연동");
			System.out.println("디비처리 진행중..." + 10 / 0);
			System.out.println("완료");
			// 예외가 발생되면 실행되지않음
//			System.out.println("자원반납");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류코드 확인하기");
			// 예외가 발생되지 않으면 실행되지않음
//			System.out.println("자원반납");
		} finally {
			// 예외상관없이 무조건 실행
			System.out.println("자원반납");
		}
	}
}
