package chap07;

public class Coffee extends Beverage {
	public static int amount;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		calcPrice();
		amount++;
	}

	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		if (getName().equals("Americano")) {
			setPrice(1500);
		} else if (getName().equals("CafeLatte")) {
			setPrice(2500);
		}  else if (getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}

}
