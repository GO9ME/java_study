package chap07.oop.poly;

/*
	추상 클래스
	-> 	객체를 생성할 수 없는 클래스, 미완성된 클래스
		내용이 구현되어 있지 않은 메소드를 포함하고 있는 클래스를 추상클래스
		추상메소드(body가 없는 메소드)
	1) 	추상메소드를 선언하는 방법
		접근제어자 abstract 리턴타입 메소드명(매개변수1, 매개변수2....);
		
	2)	추상클래스의 특징
		- 추상메소드가 하나라도 정의되어 있으면 추상클래스가 됨
		따라서 추상 클래스는 선언부에 abstract 추가
		- 추상 클래스에는 추상메소드와 일반메소드를 모두 정의 가능
		- 추상 클래스는 객체생성을 할 수 없는 클래스 
		- 추상 클래스를 상속받는 클래스는 extends하면 에러가 발생
			=> 	Child 클래스가 Parent를 상속 받는다. 
				Parent의 모든 멤버가 Child의 소유가 됨
				Child는 Parent의 일반 메소드인 test와 추상메소드인 display를 모두 소유하므로 Child도 추상클래스가 된다.
			[에러처리]
			1. Child 클래스 앞에 abstract 키워드 추가 
			2. Child가 갖고 있는 추상 메소드를 구현(오버라이딩)
		- abstract 클래스는 상위클래스로 사용하기 위해서 (상위클래스로 사용할 목적으로 정의되며 실제 타입으로만 사용)
		- abstract 메소드는 하위클래스에서 반드시 오버라이딩되어야 한다는것을 문법적으로 제시

*/
abstract class Parent{
	public void test() {
		System.out.println("일반 메소드");
	}
	public abstract void display(String msg);
}
class Child extends Parent{
	// 컴파일러에게 정보를 알려줌 annotation
	// @Override는 컴파일러에게 오버라이딩된 메소드라는 것을 알려주는 작업
	@Override
	public void display(String msg) {
		// TODO Auto-generated method stub
		Parent obj = new Child();
		obj.display("");
		
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
