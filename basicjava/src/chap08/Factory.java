package chap08;

public abstract class Factory {
	private int openHour;
	private int closeHour;
	private String name;

	public Factory() {
		// TODO Auto-generated constructor stub
	}

	public Factory(int openHour, int closeHour, String name) {
		super();
		this.openHour = openHour;
		this.closeHour = closeHour;
		this.name = name;
	}

	public int getWorkingTime() {
		return this.closeHour - this.openHour;
	}

	public abstract int makeProducts(char skill);

	public int getOpenHour() {
		return openHour;
	}

	public void setOpenHour(int openHour) {
		this.openHour = openHour;
	}

	public int getCloseHour() {
		return closeHour;
	}

	public void setCloseHour(int closeHour) {
		this.closeHour = closeHour;
	}

	public String getFactoryName() {
		return name;
	}

//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}

}
