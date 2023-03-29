package chap05;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열의 선언과 생성
		int[] myarr = new int[5];
		
		// 배열의 초기화
		myarr[0] = 20;
		myarr[4] = 100;
		
		// 배열의 요소의 갯수
//		System.out.println(myarr.length);

		// 배열을 엑세스 - for를 이용해서 배열을 엑세스
		for ( int i = 0 ; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		
		for ( int i = 0; i < myarr.length; i++) {
			myarr[i] = 100;
			System.out.println(myarr[i]);
		}
	
	}

}
