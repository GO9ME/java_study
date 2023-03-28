package api.util.collection;

import java.util.Vector;

// 78,99,100,95,100 점을 Vector 에 저장하고 저장된 점수들의 총점과 평균을 구해서 출력하기

public class VectorExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		double avg = 0;

		v.add(78);
		v.add(99);
		v.add(100);
		v.add(95);
		v.add(100);
		
		for ( int i = 0 ; i < v.size(); i++) {
			sum += v.get(i);
		}
		avg = sum / (double) v.size();

		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		
		v.set(0, 10);
		

	}

}
