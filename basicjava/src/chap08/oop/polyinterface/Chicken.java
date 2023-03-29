package chap08.oop.polyinterface;

public class Chicken extends Animal implements Cheatable {
	private String name = "닭";
	
	public Chicken() {
		// TODO Auto-generated constructor stub
	}

	public Chicken(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		setSpeed(getSpeed()*2);
		setName("날으는 닭");
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		setDistance(getSpeed() * hours);
		System.out.println(name+"의 이동거리="+getDistance());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
