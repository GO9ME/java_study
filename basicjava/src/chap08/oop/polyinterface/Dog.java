package chap08.oop.polyinterface;

public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		setDistance(getSpeed() * (hours/2.0));
		System.out.println("개의 이동거리="+getDistance());
	}

}
