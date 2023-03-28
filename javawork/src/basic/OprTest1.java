package basic;


// 산술 연산자 확인하기
public class OprTest1{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 30;
		// + 연산자
		int result = num1 + num2;
		System.out.println("더한 결과 => " + result);

		result = num1 - num2;
		System.out.println("뺀 결과 => " + result);
		
		result = num1 * num2;
		System.out.println("곱하기 결과 => " + result);

		result = num1 / num2;
		System.out.println("나누기 결과 => " + result);

		result = num1 % num2;
		System.out.println("나머지 결과 => " + result);

		//단항 연산자(증감연산자)
		int x = 5;
		int y;

		y = x++;
		System.out.println(x);
		System.out.println(y);

		x = 5;
		y = ++x;
		System.out.println(x);
		System.out.println(y);
		
		x = 5;
		y = x--;
		System.out.println(x);
		System.out.println(y);
		
		x = 5;
		y = --x;
		System.out.println(x);
		System.out.println(y);
		
	}
}
