package chap05;

public class Array2DExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArr = new int[5][5];
		
		int val = 1;
		//입력
		for (int i = 0 ; i < intArr.length; i++) {
			for (int j = 0 ; j < intArr[i].length; j++) {
				intArr[i][j] = val;
				val++;
			}
		}
		
		//출력
		for (int i = 0 ; i < intArr.length; i++) {
			for (int j = 0 ; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
