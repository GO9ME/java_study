package basic;
//기본형 데이터 표현하기
public class PrimitiveTypeValueTest {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int num = 100;
		num = 200;
		// final 이 추가된 변수는 상수
		// 상수는 정해진 값이 저장된 변수로 값을 다시 변경할 수 없다.
		// 상수는 대문자로 정의
		final int NUM2 = 200;
//		NUM2 = 300;
		
		//논리형 - boolean
		boolean boolVal = true;
		System.out.println("boolVal => " + boolVal);
		
		// 정수형 
		byte b= 127;
		short s = 10000;
		int i = 2147483647;
		long l = 2147483648l;
		
		float f = 10.5f;
		double d = 10.5;

		char a = 'A';
		a = '한';
		
		//String 타타입의 리티럴은""
		String str = "창좀형인 sgring의 기본행처럼 표폎나하는 경우 리티ㅓ럴은 큰따우푤르 추가해서 구문";
		System.out.println("String = > " + str);
		System.out.println("char => " + a);
		
		System.out.println(10/3.0);
		
		double val1 = 10;
		double val2 = 3;
		
		System.out.println(val1/val2);
		
	}

}
