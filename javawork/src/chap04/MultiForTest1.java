package chap04;

// for 문 중첩해서 사용하기
public class MultiForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 && j == 3) {
					System.out.print("너");
				} else {
					System.out.print("2");
				}
			}
			System.out.println();
		}

		
		
	}

}
