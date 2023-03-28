package chap05;

//배열의 사이즈를 변경하는 작업 수행 - System클래스의 arraycopy메소드 활용 작업
public class ArrayCopyTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArr = new int[5];

		System.out.print("첫번째 배열=>");
		// 배열에 값을 할당하기 위한 for
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = 10 + i;
		}

		// 배열에 저장된 값을 출력하기 위한 for 문
		for (int i = 0; i < firstArr.length; i++) {
			System.out.print(firstArr[i] + "\t");
		}
		System.out.println();

		// 배열에 사이즈를 변경하는 작업
		System.out.print("두번째 배열=>");
		// 1. 새로운 배열을 생성
		int[] secondArr = new int[firstArr.length * 3];
		// 2. 기존배열을 새로운 배열에 copy하는 작업
//		System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		System.arraycopy(firstArr, 2, secondArr, 2, 2);

		// 3. 복사된 배열을 확인
		for (int i = 0; i < secondArr.length; i++) {
			System.out.print(secondArr[i] + "\t");
		}

	}

}
