package api.util.collection;

import java.util.ArrayList;

// 1부터 50까지 랜덤수를 6개 발생시켜서 ArrayList에 저장하고 출력형식대로 출력하세요
// ex) 랜덤수 5,7,9,13,40
// [출력형식]
// 5(홀수), 7(홀수),13(홀수)...
public class ArrayListExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			arr.add((int) ((Math.random() * 50) + 1));
		}

		for (int i = 0 ; i< arr.size();  i++) {
			int value = arr.get(i);
			if ( value % 2 == 0) {
				System.out.print(value + "(짝수)");
			} else {
				System.out.print(value + "(홀수)");
			}
			if (i != arr.size() - 1) {
				System.out.print(",");
			}
		}

	}

}
