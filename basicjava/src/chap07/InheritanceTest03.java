package chap07;

/*
	<상속관계에서 생성자가 갖는 특징>
	1. 모든 클래스의 최상위 클래스는 java.lang.Object클래스이다.
		=> 자바에서는 객체가 갖는 공통의 특징을 Object에 정의해놓고 컴파이러를 통해서 자동으로 상속받을 수 있도록 한다.
		(단, 이미 상속하고 있는 클래스가 없는 경우)
	2. 컴파일러에 의해서 자동으로 추가된 상위 클래스인 Object클래스가 메모리에 생성될 수 있도록 모든 클래스의 
		모든 생성자 첫번째 문장에는 super()가 생략되어있다
		즉, 부모클래스의 기본생성자를 호출하는 명령문이 생략
		
		super()
		-> 기본으로 부모의 기본생성자가 호출되고 있으나 명시적으로 매개변수가 있는 부모의 생성자를 호출할 수 있음
		-> 명시적으로 부모의 생성자를 호출하면 컴파일러는 super()를 생성자의 첫번째 문장에 추가하지 않는다.
		
	3. 부모의 매개변수가 있는 생성자를 호출하는 경우 super()를 이용
		super(매개변수1,매개변수2.....)
		-> 부모클래스의 매개변수 있는 생성자를 호출
	
	4. 생성자는 상속되지 않는다.

*/
class SuperA {
	private String name;
	
	public SuperA() {
		// TODO Auto-generated constructor stub
	}
	public SuperA(String name) {
		super();
		this.name = name;
	}

}

class SubA extends SuperA {
	int age;
	// SubA 클래스는 하위클래스로 age값만 정의되어 있지만 부모가 갖고있는 모든 값이 셋팅될 수 있도록 값을 외부에서 전달받도록 정의
	SubA(String name,int age){
		super(name); // 명시적으로 부모의 생성자를 호출하면 컴파일러는 super()호출문을 추가하지 않는다.
		this.age = age;
	}
	public SubA(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
}

public class InheritanceTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj = new SubA("BTS",30);
		SubA obj2 = new SubA("bts");
	}

}
