package test;

import chap06.Person;

public class ObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴파일러는 현재 작업 중인 패키지와 java.lang패키지만 기본으로 인식
		// 다른 패키지의 클래스를 사용하는 경우 import 해야한다.
		Person p = new Person();
		p.name = "장동건";
	}

}
