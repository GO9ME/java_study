package chap04;
// switch문의 특징
public class SwtichTest03 {
	public static void main(String[] args) {
		int data = 10;
		double data2 = 10.0;
		short data3 = 10;
		long data4 = 10;
		String data5 = new String("01");
		
		switch(data5) {
		case "01":
			System.out.println("완료");
		}
		char c= 'a';
		switch(c) {
		case 'a':
			System.out.println("완료2");
		}
	}
}
