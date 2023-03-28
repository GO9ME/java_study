package chap06;

// 메소드의 매개변수나 리턴 타입으로 참조형타입을 명시하는 경우 공유
// 참조형은 주소를 저장하고 있으므로 객체나 배열이 공유
// 메소드의 매개변수나 리턴타입으로 기본형타입을 명시하는 경우 값이 전달되는 것이므로 공유되지 않는다.
// 클래스를 하나의 소스파일에 여러개 정의하는 경우 public 클래스는 한개만 정의할 수 있고 public 클래스명과 파일명이 동일해야함
class Point {
	int x = 10;
	int y = 20;
}

public class CallByRefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int[] arr = { 10, 20, 30, 40, 50 };
		Point obj = new Point();
		System.out.println("================데이터변경전================");
		display(i, arr, obj);
		System.out.println("================데이터변경후================");
		change(i, arr, obj);
		display(i, arr, obj);
	}

	public static void display(int j, int[] myarr, Point p) {
		System.out.println("기본형변수의 값=>" + j);
		System.out.println("배열변수의 값=>" + myarr[0]);
		System.out.print("객체의 인스턴스 변수의 값 x=>" + p.x);
		System.out.println("객체의 인스턴스 변수의 값 y=>" + p.y);

	}

	public static void change(int k, int[] otherarr, Point point) {
		k = 20;
		otherarr[0] = 100;
		int temp = point.y;
		point.y = point.x;
		point.x = temp;

	}
}
