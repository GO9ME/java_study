package chap05;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열의 선언 - int 형의 데이터를 저장할 수 있는 배열변수를 선언
		// 배열의 참조할 변수를 정의하는 과정
		// [형식]
		// 데이터 타입[] 변수명
		
		int [] myarr;
		
		// 2. 배열의 생성
		// 실제 데이터를 저장할 수 있는 구조를 만드는 과정
		// 생성된 배열은 힙에 할당
		// 힙에 할당되므로 활용하기 위해서는 변수에 대입한다.
		// [형식]
		// 배열변수 = new 배열에 저장될 데이터의 타입[생성될 요소의 갯수]
	
		
		myarr = new int[5];
		int [] myarr2 = new int[3];
		int [] myarr3 = null;
		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println(myarr3);
		
		
		
	}

}
