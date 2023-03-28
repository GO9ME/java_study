package api.util.collection;

import java.util.HashSet;

// 차집합
public class HashSetTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<>();
		set1.add("java");
		set1.add("mysql");
		set1.add("servlet");
		set1.add("jdbc");
		set1.add("jsp");
		set1.add("spring");
		set1.add("css");
//		print(set1);

		// 합집합 - Set을 생성할 때 매개변수로 또다른 Set을 넘기기
		HashSet<String> set2 = new HashSet<>();
		set2.add("hadoop");
		set2.add("spark");
		set2.add("flume");
		print(set2);
		

		HashSet<String> set3 = new HashSet<>();
		set3.add("python");
		set3.add("java");
		set3.add("servlet");
		set3.add("Rasberry PI");
//		print(set3);
		
		System.out.println(set1.containsAll(set2));
		System.out.println(set1.containsAll(set3));
		set3.removeAll(set1);
		print(set3);

	}

	public static void print(HashSet<String> set) {
		for ( String data : set) {
			System.out.println(data);
		}
		System.out.println("------------------------------------");
	}
	

}
