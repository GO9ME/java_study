package api.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionExam {
	public CollectionExam() {
		// TODO Auto-generated constructor stub
	}

	public void arrayPrint(ArrayList<Board> list) {
		System.out.println("ArrayPrint 실행");
		for (Board b : list) {
			System.out.println(b);
		}
		System.out.println();
	}

	public void setPrint(HashSet<Board> set) {
		System.out.println("setPrint 실행");
		for (Board b : set) {
			System.out.println(b);
		}
		System.out.println();
	}

	public void mapPrint(HashMap<Integer, Board> map) {
		System.out.println("mapPrint 실행");
		Set<Integer> keyList = map.keySet();
		for (Integer b : keyList) {
			System.out.println(map.get(b));
		}
	}

}
