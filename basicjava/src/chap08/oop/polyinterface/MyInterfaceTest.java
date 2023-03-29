package chap08.oop.polyinterface;
// 인터페이스 특징

/*
	<<인터페이스>>
	-> 추상메소드만 보관하는 특별한 클래스
	인터페이스를 정의하고 사용하면서 다형성을 적용할 수 있고 다중상속을 구현할 수 있다.
	인터페이스는 상위타입으로 사용될 특별한 클래스
	
	1. 인터페이스를 정의하는 경우 Interface 키워드를 이용해서 정의
	2. 인터페이스는 추상메소드만 정의하는 특별한 클래스이므로 
		- 인터페이스에 정의하는 메소드는 public과 abstract은 생략이 가능(오버라이딩될 떄 자동으로 추가)
		- 하위클래스에서 오버라이딩할 때 자동으로 public이 추가되고
		- 나머지는 리턴타입이나 매개변수는 일반메소드와 동일할게 정의할 수 있음.
	3. 인터페이스가 인터페이스를 상속하는 경우 extends 키워드를 이용해서 상속
		- 인터페이스끼리 상속하는 경우 다중상속이 가능
		- , 로 구분해서 상요
	4. 클래스가 인터페이스를 상속하는 경우 다중상속이 가능
		- 상속이라기 보다는 클래스가 인터페이스의 추상메소드를 재정의해야 하므로 구현 - implements를 이용해서 구현한다
		- 클래스가 인터페이스를 상속하는 경우 여러개를 상속할 수 있다.(,로 구분해서 정의)
	5. 하나의 클래스가 클래스와 인터페이스를 모두 상속하는 경우
		클래스 상속이 인터페이스 상속보다 먼저 정의되어야 함
		class A extends Super Implements InterA{
		
		
		}
*/

interface SuperInterFaceA {
	void show(); // public abstract void show() 로 정의한 것으로 인식
}

interface InterA extends SuperInterFaceA {
	void test();

	String display(String msg);
}

interface InterB {
	void change();
}

interface childInterface extends InterA, InterB {

}

class MyClass implements InterA, InterB {
	@Override
	public void change() {
		// TODO Auto-generated method stub

	}

	@Override
	public String display(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}
}

public class MyInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
