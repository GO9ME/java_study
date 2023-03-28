package chap04;

public class MultiForExam2 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(k + " ");
				k = k + 1;
			}
			System.out.println();
		}
	}
}
