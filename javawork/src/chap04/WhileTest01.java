package chap04;

//자바프로그래밍 5번 출력하기
public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 문은 주로 실행 결과가 true/false인 메소드를 호출하여 작업하는 경우 사용
		// while문의 ()안에서 메소드 호출문이나 연산자를 이용하여 true나 false가 반환되록 식을 만들어야한다.

		int i = 1;
		while (i <= 5) {
			System.out.println("자바프로그래밍");
			i++;
		}

		System.out.println();
		
		i = 1;
		while (true) {
			System.out.println("자바프로그래밍");
			if (i == 5) {
				break;
			}
			i++;
		}
	}

}
