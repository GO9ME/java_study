package chap05;

import java.util.Scanner;

// 참조형 배열 만들기
public class ArrayExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String 객체를 참조하는 변수가 저장될 배열 만들기
		// 5개의 요소를 만들기
		// 각 요소가 참조할 String 객체를 만들어서 할당하기
		// String  객체를 만들 때 사용할 문자열(html,css,javascript,jquery,servlet)
		// 모든 배열 요소가 참조하는 스트링객체의 문자열 출력(향상된 for문)
		
		// 2. Scanner객체를 참조하는 변수가 저장된 배열 만들기
		// 3개의 요소 만들기
		// 각 배열이 참조하는 값을 출력(향상된 for문 이용)
		
		String[] strArr = new String[5];
		strArr[0] = new String("html");
		strArr[1] = new String("css");
		strArr[2] = new String("javascript");
		strArr[3] = new String("jqeury");
		strArr[4] = new String("servlet");
		
		for (String data : strArr) {
			System.out.println(data);
		}
		
		Scanner[] scannerArr = new Scanner[3];
		
		scannerArr[0] = new Scanner(System.in);
		scannerArr[1] = new Scanner(System.in);
		scannerArr[2] = new Scanner(System.in);
		
		for ( Scanner data : scannerArr) {
			System.out.println(data);
		}
		
	}

}
