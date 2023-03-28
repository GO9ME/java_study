package chap06.oop.constructor;

public class Staff {
	private String name;
	private int age;
	private String dept;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.println("이 름 : " + name + "\t나 이 : " + age + "\t부   서 : " + dept);
	}
}
