package api.lang;

public class Vehicle {
	private Owner owner;
	private int price;

	public Vehicle() {

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		Vehicle o = (Vehicle) obj;
		if (this.owner.equals(o.owner)) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "소유주정보 : " + this.owner.toString() + "\n차량정보 : 가격은 " + getPrice() + "입니다.";
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
