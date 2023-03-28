package api.lang;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}
	
	/*  이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumber(long number, int i) {
		int result = 0;
		String str = String.valueOf(number);
		char num = (char) i;
		int size = str.length();
		for ( int j = 0; j < size; j++) {
			char a = str.charAt(j);
			if (a - 48 == num) {
				result++;
			}
		}
		return result;
	}
	
}
