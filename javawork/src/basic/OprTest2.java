package basic;


//비교 연산자 - 결과가 true/false
public class OprTest2{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		
		// + 연산자는 더하기의 의미와 연결 연산자
		// + 앞의 값이 문자열(String)이면 뒤의 값도 영향을 받아서 문자열화 되므로 연산을 할 수 없다.

		System.out.println("num1 > num2 => " + (num1 > num2)); 
		System.out.println("num1 < num2 => " + (num1 < num2)); 
		System.out.println("num1 >= num2 => " + (num1 >= num2)); 
		System.out.println("num1 <= num2 => " + (num1 <= num2)); 
		System.out.println("num1 == num3 => " + (num1 == num3)); 
		System.out.println("num1 != num3 => " + (num1 != num3)); 
	}
}