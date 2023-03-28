package api.lang;
//	기본형 데이터를 참조형으로 변환할 수 있는 클래스
// 	-> wrapper클래스의 오토박싱 언박싱에 대한 개념
public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5.0 이전
		int i = 10;
		Integer in = new Integer(10);
		test(in);
		
		// 5.0 이후
		int j = 100;
		Integer in2 = j;
		test(j);
		// 5.0 이후 버전의 jdk에서는 컴파일러가 자동으로 변환해준다.
		// 참조형 매개변ㅅ두를 요구하는 메소드에 기본형 데이터를 전달해도 자동으로 
		// Integer In = new Integer(j)와 같은 코드를 실행해준다.
		// 이를 오토박싱
		
	}
	
	public static void test(Object obj) {
		// 5.0 이전 버전
		// object -> Integer 변환
		Integer in = (Integer) obj;
		// Integer를 int로 변환
		int myoldval = in.intValue();
		System.out.println("5.0이전버전:"+myoldval);
		
		// 5.0 이후 버전
		int myval = (Integer) obj;
		// int형변수에 참조변수를 전달하는 경우
		// 컴파일러가 자동으로 객체로 포장된 값을 기본형으로 변환해서 전달
		// 오토 언박싱
		System.out.println("5.0이후버전:"+myval);
		System.out.println("5.0이후버전:"+obj);
	}

}
