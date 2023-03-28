package api.util.collection;
// 배열을 ArrayList로 변환해서 리턴하는 메소드를 정의

// 메소드 명 : changeArrayList
// 매개 변수 : String[]
// 리턴 타입 : ArrayList<String>

import java.util.ArrayList;

public class ArrayListExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "java", "servlet", "jsp", "spring" };
		// 메소드 호출
		ArrayList<String> arr= changeArrayList(strArr);
		// 호출 결과로 리턴받은 ArrayList에 저장된 요소를 sysout으로 출력
		for ( int i = 0 ; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	public static ArrayList<String> changeArrayList(String[] str) {
		ArrayList<String> result = new ArrayList<String>();
		for (String s : str) {
			result.add(s);
		}
		return result;
	}
}
