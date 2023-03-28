package chap04;

public class Practive4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;

		while ((a + b) != 5) {
			a = (int) (Math.random() * 6);
			b = (int) (Math.random() * 6);
		}

		System.out.println("(" + a + "," + b + ")");
	}

}
