package chap04;

public class ForPractice0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 1000	; i++) {
			total_sum = total_sum + i;
			if (i % 2 == 1) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}

		System.out.println("총합:" + total_sum);
		System.out.println("홀수합:" + sum1);
		System.out.println("짝수합:" + sum2);
	}

}
