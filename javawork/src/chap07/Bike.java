package chap07;

public class Bike extends Wheeler{

	public Bike(String carName,int velocity,  int wheelNumber) {
		super(velocity, carName, wheelNumber);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void speedUp(int speed) {
		// TODO Auto-generated method stub
		this.velocity += speed;
		if (this.velocity > 40) {
			this.velocity = 40;
		}
		System.out.println("자전거의 현재속도는 " + this.velocity + " 입니다.");
	}

	@Override
	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		this.velocity -= speed;
		if (this.velocity < 10) {
			this.velocity = 10;
		}
		System.out.println("트럭의 최저속도위반으로 속도를 " + this.velocity + "으로 올립니다.");
	}
	
}
