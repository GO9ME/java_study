package chap08.oop.polyinterface;

public class Sales extends Employee implements Bonus {

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		double tax = 0;
		tax = getSalary() * 0.13;
		return tax;
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		int salary = getSalary() + (int) (pay * 1.2);
		setSalary(salary);
	}

}
