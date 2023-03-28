package chap05;
// Scanner를 이용해서 작업
// 숫자 두개를 Scanner를 이용해서 작업
// 1. kor, eng, math 변수를 선언하고 Scanner를 이용해서 입력 받아 값을 할당받기
// 2. 이 변수에 저장된 값들을 이용하여 아래와 같은 출력 결과가 나타나도록 프로그램
// [출력 형태]
// 총점:__
// 평균:__

import java.util.Scanner;

public class APIExam3_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kor,eng,math,total,avg;
		
		Scanner key = new Scanner(System.in);
		// space bar나 enter키가 눌려지기 전에 입력한 단어 한개만 읽어서 리턴
		System.out.print("kor:");
		kor = key.nextDouble();
		
		System.out.print("eng:");
		eng = key.nextDouble();
		
		System.out.print("math:");
		math = key.nextDouble();
		
		total = kor + eng + math;
		avg = total / 3;
		System.out.println("총점:"+total);
		System.out.println	("평균:"+avg);

	}

}
