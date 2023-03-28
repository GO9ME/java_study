package chap05; // 2차원 배열의 활용

public class Array2DTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2학급의 국어,수학,영어 점수를 저장할 배열을 만들고 값을 저장하기
		// A반 - 90,89,100
		// B반 - 98,89,97

		// 2. 저장된 배열의 모든값을 출력
		// 단, 각 과목의 점수와 전체 평균 출력하기

		int[][] arr = { {90,89,100},
						{98,89,97}};
				
		int sum = 0;
		int[] avg = new int[2];
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			avg[i] = sum / arr[i].length;
			System.out.println();
		}
		System.out.println("A반 평균:" + avg[0]);
		System.out.println("B반 평균:" + avg[1]);

	}

}
