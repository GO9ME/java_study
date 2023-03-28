package api.util.collection;

import java.util.Random;
import java.util.Vector;

import api.lang.Person;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	1. Vector 생성
		//	-> Generic을 적용하여 Vector에 저장된 요소의 타입을 명시해야한다.
		//	-> Vector안에 저장될 데이터 타입을 제한( 기본형인 경우에는 Wrapper클래스 타입으로 명시)
		Vector<Integer> v1 = new Vector<Integer>();
		//Vector에 데이터 추가
//		v1.add("java");
		v1.add(10);
//		v1.add(new Random());
//		v1.add(new Person());
		System.out.println("현재 벡터에 저장된 요소의 개수:"+v1.size());
		System.out.println("현재 백터의 용량=>"+v1.capacity());
		
	}

}
