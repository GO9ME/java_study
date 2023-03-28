package api.lang;

import java.util.Objects;

// 일반 클래스 - normal 클래스 ( POJO 클래스 : Plain Old Java Object)
public class Person {
	private String name;
	private String addr;
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// obj 가 Person타입인지 검사
		boolean result = false;
		if(obj instanceof Person) {
			// 객체의 값을 비교해야 하므로 Person의 맴버에 엑세스해야 한다. 따라서 캐스팅해야한다.
			// instanceof연산자로 타입을 체크했기 때문에 if문 안에서 obj변수를 따로 캐스팅하지 않고 맴버를 접근할 수 있음
			// 이전 버전에서는 불가능 
			Person p = (Person) obj;
			if(this.name.equals(p.name) & this.addr.equals(p.addr) & this.age == p.age) {
				result = true;
			}
		} else {
			result = false;
		}
		return result;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
