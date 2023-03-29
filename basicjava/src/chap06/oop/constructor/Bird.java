package chap06.oop.constructor;

public abstract class Bird {
	private String name;
	private int legs;
	private int length;
	
	public abstract void fly();
	public abstract void sing();	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
