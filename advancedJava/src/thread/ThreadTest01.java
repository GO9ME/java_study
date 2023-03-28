package thread;

/*
	자바에서 쓰레드 프로그래밍을 하는 방법
	1. Thread 클래스를 상속 받아 작업하는 방법
		1) Thread클래스를 상속
		2) run 메소드를 오버라이딩해서 쓰레드로 실행하고 싶은 내용을 구현
			-> run 메소드를 직접호출하지않음
		3) Thread 객체의 start메서드를 호출
			-> start메소드를 호출하면 JVM 내부에 스케줄러에 의해서 run메소드가 적절한 시점에 호출
	2. Runnable인터페이스의 하위 클래스를 작성하고 이를 이용해서 Thread클래스를 생성하는 방법
*/
class ThreadDemo01 extends Thread {
	public ThreadDemo01(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + "("+getName()+")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}

}

public class ThreadTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------메인쓰레드 시작-------------");
		ThreadDemo01 thread1 = new ThreadDemo01("thread1");
		ThreadDemo01 thread2 = new ThreadDemo01("thread2");
		
//		thread1.run();
//		thread2.run();	// 쓰레드 작업이 아니라 단순 메소드 call
		thread1.start();
		thread2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("메인쓰레드");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("-------------메인쓰레드 종료-------------");
	}

}
