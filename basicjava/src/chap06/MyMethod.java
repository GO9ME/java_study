package chap06;

public class MyMethod {
	// 1.
	public void display() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// 2.
	public void display(String str) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	// 3.
	public void display(String str, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	// 4.
	public int sum(int a, int b) {
		return a + b;
	}

}
