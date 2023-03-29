package chap04;

import java.util.Random;

// if 문 연습하기
public class IfTest01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		
		System.out.println(num);
		// {}을 표시하지 않으면 조건이 만족할 때 if문 바로 아래 문장만 실행
		if (num > 90) {
			System.out.println("테스트작업완료");
			System.out.println("처리진행");
		}
		
		System.out.println("종료");
	}
}
