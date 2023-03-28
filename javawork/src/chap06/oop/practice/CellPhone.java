package chap06.oop.practice;

public class CellPhone {
	private String name;
	private int batteryVal;
	private int callVal;
	
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}

	public CellPhone(String name) {
		this.name = name;
	}
	
	public void charge(int batteryVal) {
		this.batteryVal = this.batteryVal + batteryVal;
	}
	
	public void call(int callVal) {
		this.callVal = callVal;
	}
	
	public void printBattery() {
		System.out.println("배터리 남은 잔량:"+ this.batteryVal);
	}
	
}
