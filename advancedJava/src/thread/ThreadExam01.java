package thread;

/*
	1. A ~ Z 까지 출력하는 AlphaThread 작성
		-> 0.5 초 sleep
	2. 1~100까지 출력하는 DigitThread 작성
		-> 10개 출력하고 줄바꿈
		-> 0.1초 sleep
	3. 메인쓰레드
		1,2에서 작성한 클래스를 Thread로 실행하기

*/
class AlphaThread extends Thread{

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
class DigitThread extends Thread{

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

public class ThreadExam01 {
	public static void main(String[] args) {
		AlphaThread at = new AlphaThread();
		DigitThread dt = new DigitThread();
		
		at.start();
		dt.start();
	}
}
