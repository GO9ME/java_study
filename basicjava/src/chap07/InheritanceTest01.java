package chap07;

/*
	<상속관계에서 맴버 변수가 갖는 특징>
	1. 상속관계에서 상위클래스에 선언된 맴버변수는 하위클래스에서 접근이 가능
	2. 상위 클래스에서 선언된 변수의 동일한 이름의 멤버변수를 하위클래스에 정의하면 부모클래스의 멤버변수보다 하위클래스의 멤버변수가 우선순위가 높다
	3. 하위클래스에서 상위클래스의 멤버를 접근(엑세스,호출,사용) 하고 싶다면 super 키워드 이용 접근
	 	this -> 자기 자신의 객체
	 	super -> 부모객체
	4. 상위클래스의 맴버가 private으로 정의되어있으면 하위클래스에서 접근할수 없다.
*/
class Super{
	int num = 10;
}
class Sub extends Super{
	int num = 100;
	public void display() {
		System.out.println("num=>"+num);
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.display();
		System.out.println(obj);
	}
}
