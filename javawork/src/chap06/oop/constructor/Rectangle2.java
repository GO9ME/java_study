package chap06.oop.constructor;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;
	private int area;
	private int perimeter;

	public Rectangle2() {
		// TODO Auto-generated constructor stub
	}

	public int area() {
		this.area = this.width * this.length;
		return this.area;
	}

	public int perimeter() {
		this.perimeter = (this.width + this.length) * 2;
		return this.perimeter;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
