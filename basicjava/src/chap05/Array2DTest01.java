package chap05;

// 2차원 배열을 정의하고 엑세스 - 배열의 배열(배열을 참조하는 배열)
public class Array2DTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myarr = new int[3][2];

		// myarr가 참조하는 배열이 0번 요수가 참조하는 배열의 0번째 요소에 100할당
		myarr[0][0] = 100;
		myarr[1][0] = 100;
		myarr[2][0] = 100;

		// myarr길이
		System.out.println(myarr.length);

		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
