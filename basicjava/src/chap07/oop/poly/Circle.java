package chap07.oop.poly;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		setArea(this.radius * this.radius *  Math.PI); 
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
