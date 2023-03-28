package api.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Set
// -> 집합 ( 순서가 없고, 중복이 허용되지 않는다.)
public class HashSetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("자바");
		list.add("서블릿");
		list.add("JSP");
		list.add("스프링");
		list.add("스프링");
		
		int size = list.size();
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("==========================");
		
		HashSet<String> set = new HashSet<>();
		set.add("자바");
		set.add("서블릿");
		set.add("JSP");
		set.add("스프링");
		set.add("스프링");
		
		System.out.println(set.contains("스프링"));
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		
	}

}
