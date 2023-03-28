package api.util.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 100,90,88,77,100 HashSet에 저장하기
		HashSetExam01 ex1 = new HashSetExam01();
		HashSet<Integer> hs = new HashSet<>();

		hs.add(100);
		hs.add(90);
		hs.add(88);
		hs.add(77);
		hs.add(100);

		// 4. 2번에서 정의한 메소드 호출해서 리턴받은 배열 출력하기
		int size = hs.size();
		int[] value = new int[size];
		value = ex1.changeArr(hs);
		for (int i : value) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 5. 3번에 정의한 메소드 호출해서 HashSet에 저장된 요소 출력하기.
		hashPrint(hs, true);

	}

	// 2. HashSet을 배열로 변환하는 메소드를 작성
	// 메소드명 : changeArr
	// 매개변수 : Hashset(타입은 임의로 정의)
	// 리턴 타입 배열
	public int[] changeArr(HashSet<Integer> hs) {
		int[] result = hashPrint(hs, false);
		return result;
	}

	// 3. HashSet에 저당된 요소를 출력하는 메소드
	// -> Iterator사용해서 출력하기
	// -> 메소드 스팩은 임의로 정의하기
	public static int[] hashPrint(HashSet<Integer> hs, boolean flag) {
		int[] result = new int[hs.size()];
		Iterator<Integer> it = hs.iterator();
		int i = 0;
		while (it.hasNext()) {
			int data = it.next();
			result[i] = data;
			i++;
			if (flag) {
				System.out.print(data + "\t");
			}
		}
		return result;
	}
}
