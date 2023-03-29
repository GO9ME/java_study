package chap05;
// 기본형 변수와 참조형 변수의 비교
public class VariableTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 10;
		System.out.println("======기본형======");
		if (i == j) {
			System.out.println("기본형 같다.");
		} else {
			System.out.println("기본형 다르다.");
		}
		
		// 참조형 변수에 == 연산자는 주소를 비교
		System.out.println("======참조형======");
		String str1 = new String("java");
//		String str1 = "java";
		String str2 = new String("java");
//		String str2 = "java";
		if (str1 == str2) {
			System.out.println("참조형 같다.");
		} else {
			System.out.println("참조형 다르다.");
		}
			
		// String 클래스에 할당된 문자열을 비교하고 싶은 경우 String 클래스에서 지원되는 메소드를 이용해서 비교
		// str1이 참조하는 String 객체가 갖고 있는 문자열과 str2가 참조하는 String 객체가 갖고 있는 문자열을 비교(대소문자 비교) 
		if (str1.equals(str2)) {
			System.out.println("문자열 같다.");
		} else {
			System.out.println("문자열 다르다.");
		}
		
		
	}

}
