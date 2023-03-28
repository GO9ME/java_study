package chap07;

public class Student extends Person{
	private int id;

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		super.print();
		System.out.println("\t학   번 : " + this.id);
	}
}
