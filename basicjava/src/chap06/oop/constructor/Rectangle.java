package chap06.oop.constructor;

public class Rectangle {
	private int width;
	private int height;
	private String color = "흰색";
	private int area;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height, String color) {
		this(width,height);
		this.color = color;
	}
	
	public void calculateArea() {
		this.area = this.width * this.height;
	}


	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	
}
