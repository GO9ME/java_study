package chap05;

public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 랜덤수가 배열에 저장될 수 있도록 작성하기
		// int형 배열(요소 5개)
		// 배열에 저장된 데이터를 엑세스 해서 다음과 같이 작업하기
		// [출력형식]
		// 0번 요소 -> ____(짝수 | 홀수)
		// 1번 요소 -> ____(짝수 | 홀수)
		
		int[] arr = new int[5];
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(i + "번 요소 -> " + arr[i] + "(짝수)");
			} else {
				System.out.println(i + "번 요소 -> " + arr[i] + "(홀수)");
			}
		}
		
	}

}
