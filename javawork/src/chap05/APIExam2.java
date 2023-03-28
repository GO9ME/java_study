package chap05;

import java.util.Random;

//API사용법 연습하기2
public class APIExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.util패키지의 Random 클래스를 이용해서 작업하기
		// - 변수명 : rand
		// 1. nextInt()메소드를 호출해서 랜덤수를 다음과 같이 출력하기
		// [출력형태]
		// 랜덤수:__
		
		// 1번 작업을 완료하신 분들은 1부터 100까지 랜덤수도 출력해보기
		// [출력형태]
		// 랜덤수:__
		// nextInt(정수)의 스펙으로 정의된 메소드를 찾아서 api문서를 보고 확인하여 작성하기
		
		Random rand = new Random();
		int result = rand.nextInt();
		System.out.println("랜덤수:" + result);
		
		int result2 = rand.nextInt(100) + 1;
		System.out.println("랜덤수:" + result2);
		
	}

}
