package chap08;

public class CarFactory extends Factory implements IWorkingTogether {
	
	
	public CarFactory() {
		// TODO Auto-generated constructor stub
	}

	public CarFactory(String name, int openHour, int closeHour) {
		super(openHour, closeHour, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		Factory f = (Factory) partner;
		int result = f.makeProducts('B');
		return result;
	}

	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		int result = 0;
		switch(skill) {
		case 'A':
			result = 3 * getWorkingTime();
			break;
		case 'B':
			result = 2 * getWorkingTime();
			break;
		case 'C':
			result = 1 * getWorkingTime();
			break;
		default :
			result = 0;
			break;
		}
		
		return result;
	}

}
