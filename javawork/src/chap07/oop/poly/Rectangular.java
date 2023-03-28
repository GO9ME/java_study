package chap07.oop.poly;

public class Rectangular extends Shape {

	private double width;
	private double hight;

	public Rectangular() {
		// TODO Auto-generated constructor stub
	}

	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		setArea(hight*width);

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

}
