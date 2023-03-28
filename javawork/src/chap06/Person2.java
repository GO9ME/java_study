package chap06;

// 자바의 특성에 맞게 클래스를 정의
// 클래스를 정의하는 경우 맴버변수(클래스의 속성, 클래스의 구성요소, 클래스에서 다루는 데이터)는 private으로 선언해서 외부에서 
// 접근할 수 없도록 정보를 은닉하고 public 메소드를 통해서 접근할 수 있도록 구현
public class Person2 {
	// private으로 정보를 은닉 - 외부에서 직접 접근할 수 없도록 처리
	private String name;
	private String addr;
	private int age;

	// 모든 맴버변수가 private으로 선언되어 있으므로 값을 성정하는 메소드와 값을 가져올 수 있는 메소드가 필요
	// 객체의 필드에 값을 설정하는 메소드
	// 메소드명 : set + 값을 저장할 변수의 첫글자를 대문자로 변경한 이름
	// 맴버 변수의 값을 저장하는 메소드 = setter 메소드

	public void setName(String name) {
		// 멤버변수 name의 값을 매개변수로 바꾸는 메소드
		// 맴버변수 name = 매개변수 name
		this.name = name;
	}

	// 객체의 맴버변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	// 메소드명 : get + 멤버변수명(첫 글자를 대문자로 바꾼 이름)
	// 맴버 변수의 값을 가져오는 메소드 : getter 메소드
	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
