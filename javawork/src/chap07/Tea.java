package chap07;

public class Tea extends Beverage {
	public static int amount;

	public Tea() {
		// TODO Auto-generated constructor stub
	}

	public Tea(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		calcPrice();
		amount++;
	}

	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		if (getName().equals("lemonTea")) {
			setPrice(1500);
		} else if (getName().equals("ginsengTea")) {
			setPrice(2000);
		}  else if (getName().equals("redginsengTea")) {
			setPrice(2500);
		}
	}

}
