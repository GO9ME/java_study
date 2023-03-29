package chap05;
// 배열만들기 실습
public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. int 형 데이터가 저장될 배열을 생성하기
		// -> 5개의 요소를 갖도록 작성
		// 100,200,300,400,500의 값을 할당하기
		// 2. 저장된 배열을 출력해보기
		
		int[] arr = new int[5];
		int data = 100;
		
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = data;
			data += 100;
		}
		
		for (int i = 0 ; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
