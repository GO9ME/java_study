package chap07;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.print("이 름 : " + name + "\t나 이 : " + age );
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
