package chap07.oop.poly;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Stack;
import java.util.Vector;

//객체의 형변환
// -> 무조건 객체의 형변환은 상속관계에서만 가능
public class RefTypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("java");
		StringBuffer sb = new StringBuffer();
		
//		str = (String) sb;
		
		// 상속관계에 있는 클래스는 자동 클래스
		// 상위클래스 타입 변수 = new 하위클래스()
		AbstractCollection c = new Vector();
		AbstractList c2 = new Vector();
		AbstractList c3 = new Stack();
		
		
		
		
		
		
	}

}
