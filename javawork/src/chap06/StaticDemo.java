package chap06;
// 인스턴스 변수와 클래스 변수의 비교
// 인스턴스 변수 -> 객체가 소유하는 변수(객체변수)
// 클래스 변수 -> 모든 객체가 공유해서 사용하는 변수(정적변수)

public class StaticDemo {
	int num;
	static int statcNum;
	
	public StaticDemo() {
		num++;
		statcNum++; 
	}
	public void display() {
		System.out.println("num=>"+ num + ",staticNum=>"+statcNum);
	}
}
