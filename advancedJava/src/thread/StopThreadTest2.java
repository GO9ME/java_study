package thread;

/*
	쓰레드 종료
	2. 인터럽트를 발생시키고 현재 상태를 확인한 후 작업하기

*/

class StopThread02 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("현재 쓰레드 상태 : 실행 중");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("현재 쓰레드 상태 : 종료");
		}
	}
	
}


public class StopThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===============메인쓰레드 시작===============");
		Thread t= new Thread(new StopThread02());
		t.start();
		System.out.println("쓰레드 이름 :"+t.getName());
		System.out.println("인터럽트상태 :"+t.isInterrupted());
		System.out.println("인터럽트상태 :"+t.isInterrupted());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 인터럽트 발생
		t.interrupt();
		System.out.println("인터럽트상태 :"+t.isInterrupted());
		System.out.println("인터럽트상태 :"+t.isInterrupted());
		System.out.println("===============메인쓰레드 종료===============");
	}

}
