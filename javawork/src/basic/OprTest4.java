package basic;

//논로연산자 - &&, ||
public class OprTest4{
	public static void main(String[] args){
		int num1 = 200;
		System.out.println("작업시작");
		
		String str = null;
		//str.length();
		//System.out.println(num1>100 | str.length() > 0);
		System.out.println(num1>100 || str.length() > 0);
		
		System.out.println("작업종료");
	}
}