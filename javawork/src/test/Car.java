package test;

public abstract class Car {
	private Point point;
	private int speed;
	protected double distance;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Point point, int speed) {
		this.point = point;
		this.speed = speed;
	}

	public abstract void run(int hour);

	public abstract double calcToll();

	public abstract void print();

	public static void printTitle() {
		System.out.println("차종\t speed\t distance\t x좌표\t y좌표\t 요금");
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
