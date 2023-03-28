package api.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionExam ce = new CollectionExam();
		Board b1 = new Board(1, "김씨", "김씨TEST", "김씨내용TEST");
		Board b2 = new Board(2, "이씨", "이씨TEST", "이씨내용TEST");
		Board b3 = new Board(3, "박씨", "박씨TEST", "박씨내용TEST");
		Board b4 = new Board(4, "민씨", "민씨TEST", "민씨내용TEST");
		Board b5 = new Board(5, "최씨", "최씨TEST", "최씨내용TEST");
		
		ArrayList<Board> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		HashSet<Board> set = new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		HashMap<Integer, Board> map = new HashMap<>();
		map.put(b1.getNum(), b1);
		map.put(b2.getNum(), b2);
		map.put(b3.getNum(), b3);
		map.put(b4.getNum(), b4);
		map.put(b5.getNum(), b5);
		
		ce.arrayPrint(list);
		ce.setPrint(set);
		ce.mapPrint(map);
	}

}
