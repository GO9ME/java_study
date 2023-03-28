package thread.sync;

public class AccountSumThread implements Runnable {
	Obj obj;

	public AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			synchronized (obj) {
				long total = obj.acc2.getBalance() + obj.acc2.getBalance();
				System.out.println("총 잔액 : " + total);
			}
		}
	}

}
