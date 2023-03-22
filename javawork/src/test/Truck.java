package test;

public class Truck extends Car {
	private int weight;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(Point point, int speed) {
		super(point, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(int hour) {
		// TODO Auto-generated method stub
		super.distance = getSpeed() * hour * 0.7;
	}

	@Override
	public double calcToll() {
		// TODO Auto-generated method stub
		double result = super.distance * getWeight() * 0.12;
		return result;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("트럭\t %d\t %.1f\t\t %d\t %d\t %.1f\t\n", getSpeed(), super.distance, getPoint().getX(),
				getPoint().getY(), calcToll());

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
