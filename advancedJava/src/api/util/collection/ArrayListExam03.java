package api.util.collection;

import java.util.ArrayList;

public class ArrayListExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 번호 성명 국어 수학 영어
		 * 
		 * 1 장동건 100 90 88 2 이민호 89 100 100 3 김범룡 95 89 100
		 * 
		 * => 제목 뺴고 데이터만 ArrayList에 저장하기
		 */
		ArrayListExam03 ex3 = new ArrayListExam03();
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		String str1 = "1	장동건 	100	90	88";
		String str2 = "2	이민호 	89	100	100";
		String str3 = "3	김벙룡 	95	89	100";

		strList.add(str1);
		strList.add(str2);
		strList.add(str3);

		list.add(strList);
		System.out.println("번호\t성명\t국어\t수학\t영어");
		ex3.display(list);
	}

	public void display(ArrayList<ArrayList<String>> list) {
		int arrSize = list.size();
		for (int i = 0; i < arrSize; i++) {
			int size = list.get(i).size();
			ArrayList<String> arr = list.get(i);
			for (int k = 0 ; k < size; k++) {
				System.out.println(arr.get(k));
			}
		}
	}

}
