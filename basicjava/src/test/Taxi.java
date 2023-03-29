package test;

public class Taxi extends Car {
	private int taxifare;

	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taxi(Point point, int speed) {
		super(point, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(int hour) {
		// TODO Auto-generated method stub
		super.distance = getSpeed() * hour;
	}

	@Override
	public double calcToll() {
		// TODO Auto-generated method stub
		double result = super.distance * getTaxifare() * 0.023;
		return result;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("택시\t %d\t %.1f\t\t %d\t %d\t %.1f\t\n", getSpeed(), super.distance, getPoint().getX(),
				getPoint().getY(), calcToll());
	}

	public int getTaxifare() {
		return taxifare;
	}

	public void setTaxifare(int taxifare) {
		this.taxifare = taxifare;
	}

}
