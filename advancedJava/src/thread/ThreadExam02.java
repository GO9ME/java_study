package thread;

class AlphaThread2 implements Runnable{

	@Override
	public void run(){
		for ( char c = 'A' ; c <= 'Z'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class DigitThread2 implements Runnable{

	@Override
	public void run() {
		for ( int i = 1; i <= 100 ; i ++ ) {
			System.out.print(i);
			if ( i % 10 == 0 ) {
				System.out.println();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphaThread2 obj = new AlphaThread2();
		DigitThread2 obj2 = new DigitThread2();
		// 2. 생성한 Runnable 객체를 이용해서 Thread 객체를 생성
		Thread t1 = new Thread(obj,"t1");
		Thread t2 = new Thread(obj2,"t2");
		
		t1.start();
		t2.start();
	}

}
