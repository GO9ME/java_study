package thread;

class Thread3_1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 0 ; i <= 100000000 ; i ++) {
			
		}
	}
}
class Thread3_2 extends Thread {
	Thread t;

	public Thread3_2(Thread t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("인터럽트발생");
			e.printStackTrace();
		}
		for ( int i = 0 ; i <= 100000000 ; i ++) {
			
		}
	}
	
}

public class ThreadJoinTest {
	public static void main(String[] args) {
	Thread3_1 t1 = new Thread3_1();
	Thread3_2 t2 = new Thread3_2(t1);
	t1.start();
	t2.start();
	
	t2.interrupt();
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(t1.getName()+"상태:"+t1.getState());
	System.out.println(t2.getName()+"상태:"+t2.getState());
	} 
	
}
