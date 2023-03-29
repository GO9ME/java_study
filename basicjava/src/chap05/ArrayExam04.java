package chap05;

public class ArrayExam04 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int oddsum = 0;
		int evensum = 0;
		
		for ( int i = 0 ; i < ia.length; i++) {
			if ( ia[i] % 2 == 0 ) {
				evensum += ia[i];
			} else {
				oddsum += ia[i];
			}
		}
		System.out.println("( 배열 ia )");
		System.out.println("홀수의 합:"+oddsum);
		System.out.println("짝수의 합:"+evensum);
		
		oddsum = 0;
		evensum = 0;
		
		for ( int i = 0 ; i < ib.length; i++) {
			if ( ib[i] % 2 == 0 ) {
				evensum += ib[i];
			} else {
				oddsum += ib[i];
			}
		}
		System.out.println("( 배열 ib )");
		System.out.println("홀수의 합:"+oddsum);
		System.out.println("짝수의 합:"+evensum);
		
	
	}
	
	
}