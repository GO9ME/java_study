package chap05;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,3,8,2};
		
		int max = 0;
		for (int i = 0 ; i < array.length; i++) {
			if (i == 0) {
				max = array[i];
			} else {
				if (max > array[i]) {
					max = max;
				} else {
					max = array[i];
				}
			}
		}
		
		System.out.println("최대값은:"+max);
		
	}

}
