package chap06;

public class StaticMethodDemoTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo obj = new StaticMethodDemo();
		StaticMethodDemo obj2 = new StaticMethodDemo();
		StaticMethodDemo obj3 = new StaticMethodDemo();

		// == 외부 클래스에서 호출 ==
		// 클래스 메소드의 호출 => 클래스명.메소드명()
		StaticMethodDemo.test();
		// 인스턴스 메소드의 호출
		// -> 객체생성 후 객체를 참조하는 변수를 이용해서 호출
		obj.change();
	}

}
