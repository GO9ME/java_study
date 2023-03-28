package api.lang;

public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java programming";
		String str2 = new String("java mysql html5 css javascript jquery");
		
		// 1. String -> byte[]
		byte[] byteArr = str.getBytes();
		for (byte b : byteArr) {
			System.out.print(b + " ");
		}
		System.out.println();
		// 2. String -> char[]
		char[] charArr = str.toCharArray();
		for ( int i = 0 ; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
		System.out.println();
		
		// 3. String - > String[]
		String [] stringArr = str2.split(" ");
		for ( String s : stringArr) {
			System.out.print(s+ " ");
		}
		
		// 4. 기본형 -> String
		int i = 1000;
		double d = 10.5;
		test(String.valueOf(d));
		test(String.valueOf(i));
		
		test(d+"");
		test(i+"");
	}
	
	public static void test(String data) {
		System.out.println("전달받은 데잍터=>"+data);
	}

}
