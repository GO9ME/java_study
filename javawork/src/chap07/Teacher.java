package chap07;

public class Teacher extends Person{
	private String subject;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.println("\t담당과목 : " + subject);
	}

}
