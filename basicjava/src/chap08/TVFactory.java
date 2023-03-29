package chap08;

public class TVFactory extends Factory implements IWorkingTogether {

	public TVFactory() {
		// TODO Auto-generated constructor stub
	}

	public TVFactory(String name,int openHour, int closeHour) {
		super(openHour, closeHour, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		Factory f = (Factory) partner;
		int result = f.makeProducts('C');
		return result;
	}

	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		int result = 0;
		switch(skill) {
		case 'A':
			result = 8 * getWorkingTime();
			break;
		case 'B':
			result = 5 * getWorkingTime();
			break;
		case 'C':
			result = 3 * getWorkingTime();
			break;
		default :
			result = 1 * getWorkingTime();
			break;
		}
		
		return result;
	}
}
