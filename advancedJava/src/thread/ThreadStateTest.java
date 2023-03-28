package thread;
class MyThread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 0 ; i <= 100000000 ; i ++) {
			
		}
	}
}
public class ThreadStateTest {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		System.out.println("쓰레드의 상태:"+t.getState());
		t.start();
		System.out.println("쓰레드의 상태:"+t.getState());
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("쓰레드의 상태:"+t.getState());
	}
}
