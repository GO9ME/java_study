package thread;


class MyThread5 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 1 ; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


// 일반 쓰레드는 메인쓰레드와 상관없이 자신의 작업이 종료되어야 종료
// 데몬 쓰레드로 만드는 작업을 하면 메인쓰레드가 종료되면 쓰레드가 종료되도록 작업할 수 있음
// start하기전에 작업해야 한다



public class DaemonThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인쓰레드 시작");
		MyThread5 t = new MyThread5();
		t.setDaemon(true);
		t.start();
		for ( int i = 1 ; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main 쓰레드 종료");
	}

}
