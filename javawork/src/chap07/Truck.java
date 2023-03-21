package chap07;

public class Truck extends Wheeler{

	public Truck(String carName,int velocity,  int wheelNumber) {
		super(velocity, carName, wheelNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp(int speed) {
		// TODO Auto-generated method stub
		this.velocity += 5 * (speed);
		if (this.velocity > 100) {
			this.velocity = 100;
		}
		System.out.println("트럭의 현재속도는 " + this.velocity + " 입니다.");
	}

	@Override
	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		this.velocity -= 5 * (speed);
		if (this.velocity < 50) {
			this.velocity = 50;
		}
		System.out.println("트럭의 최저속도위반으로 속도를 " + this.velocity + "으로 올립니다.");
	}
	
	
	
}
