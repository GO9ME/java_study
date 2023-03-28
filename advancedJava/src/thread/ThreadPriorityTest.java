package thread;

class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 시간 지연을 위한 코드 - 프로그램이 실행되는 시간을 표현
		for ( int i = 0 ; i <= 100000000 ; i ++) {
			
		}
		System.out.println(getName()+"쓰레드의 우선순위->"+getPriority());
	}
}


public class ThreadPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자가 클수록 우선수위가 높다
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		for ( int i = 1 ; i<=3 ; i++) {
			MyThread t= new MyThread();
			t.start();	
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for ( int i = 1 ; i<=10 ; i++) {
			MyThread t= new MyThread();
			t.setName("t"+i);
			if ( i == 7 ) {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();	
		}
	}
	

}
