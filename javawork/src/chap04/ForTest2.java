package chap04;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음과 같은 조건을 만족할 수 있도록 작업
		// for 문을 10번실행
		// 홀수번째는 **********
		// 짝수번째는 ==========
		// 초기화 변수를 여러개 정의 가능
		// -> 초기화 변수를 여러개 정의하면 조건과 증감식에도 추가해야 한다.
		for (int i = 1 ; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("==========");
			} else {
				System.out.println("**********");
			}
		}
		
	}

}
