package chap06;

public class Prob1 {
	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };
		
		Prob1 obj = new Prob1();
		obj.calcArr(ia);
		obj.calcArr(ib);
		
		int[] arr = obj.oddArr();
		for (int i : arr) {
			System.out.print(i);
		}
	}
	
	
	public void calcArr(int[] arr) {
		// 배열의 합을 구해서 출력
		int oddHap = 0;
		int evenHap = 0;
		
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] % 2 == 0 ) {
				evenHap = evenHap + arr[i];
			} else {
				oddHap = oddHap + arr[i];
			}
		}
		
		System.out.println("홀수의합:"+oddHap);
		System.out.println("짝수의합:"+evenHap);
	}
	
	public int[] oddArr() {
		int[] arr = new int[10];
		int num = 1 ;
		for (int i = 0; i <arr.length; i++) {
			if ( num % 2 != 0 ) {
				arr[i/2] = num;
			}
			num++;
		}
		
		return arr;
	}
	
	
	
	
	
	
}

