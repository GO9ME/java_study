package api.lang;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("BTS", "서울", 30);
		Person p2 = new Person("BTS", "서울", 30);
		
		if (p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(p1);
		System.out.println(p1.toString());

		// Object의 getClass
		System.out.println(p1.getClass());
		//API에서 제공되는 클래스들에 재정의된 toString확인
		Date d = new Date();
		System.out.println(d);
		
		String str = new String("Java");
		System.out.println(str);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("servlet");
		System.out.println(list);
		
		Random rand = new Random();
		System.out.println(rand);
		
	}
}
