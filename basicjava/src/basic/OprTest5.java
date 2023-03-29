package basic;

//삼항 연산자, 대입 연산자

public class OprTest5{
	public static void main(String[] args){
		int num1 = 99;
		String str = "문자열";
		String result = num1 > 90 ? "합격" : "불합격";
		System.out.println(result);
		
		int intValResult = num1 > 90 ? 10000 : 0 ;
		System.out.println(intValResult);

		int i = 100;
		i = i + 10;
		System.out.println("i = " + i);

		i += 30;
		System.out.println("i = " + i);

		i -= 30;
		System.out.println("i = " + i);

		i *= 30;
		System.out.println("i = " + i);

		i /= 30;
		System.out.println("i = " + i);
	}
}