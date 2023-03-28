package thread;

/*
 *
	한 번 start된 쓰레드는 절대 다시 실행할 수 없다.
	-> 일회용
	
	쓰레드를 종료
	1.	임의 변수를 선언해서 종료하는 방법
		flag 변수
		-	변수에 저장된 값에 따라서 작업을 처리할 용도 (실행 or 종료 - boolean 변수, int 변수...)
		-	변수 값을 체크 ( 오래 걸리는 작업인 경우 중간에 stop할 수 있다.)


*/
class StopThread extends Thread{
	private boolean state = true;
	public void run() {
		while(state) {
			System.out.println("현재 쓰레드의 상태 : 실행중 ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("현재 쓰레드 상태 : 종료상태");
	};
	public void stopThread() {
		state = false;
	}
}

public class StopThreadTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===============메인쓰레드 시작===============");
		StopThread t1 = new StopThread();
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stopThread();
		System.out.println("===============메인쓰레드 종료===============");
	}

}
