package basic;
//기본형 데이터의 타입 캐스팅(형 변환)
public class PrimitiveTypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자동형변환 - JVM 내부에서 자동으로 형변환
		byte b = 100;
		short s = b; // 형변환
		int i = s;
		long l = i;
		System.out.println("값:"+l);
		
		float f = l;
		System.out.println("값:"+f);
		
		double d = f;
		
		char c = 'a';
		System.out.println("char값:"+c);
		int data = c;
		System.out.println("int값:"+ data);
		char c2 = (char) data;
		
		// 2. 명시적 형변환
		int intval = 10;
		byte byteval = (byte) intval;
		System.out.println(byteval);
		
		
	}

}
