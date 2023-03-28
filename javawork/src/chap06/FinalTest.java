package chap06;
// final은 클래스, 메소드, 변수 앞에 모두 차가해서 사용할 수 있음

public class FinalTest {
	// 변수 앞에 final 추가하면 상수 -> 변하지 않는 수
	public static final int MY_VAL = 10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM = 100; // final 변수는 상수이므로 프로그램 중간에 값을 변경할 수 없음
	}

}
