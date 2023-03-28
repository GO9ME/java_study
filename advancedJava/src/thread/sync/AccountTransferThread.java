package thread.sync;

public class AccountTransferThread extends Thread {
	Obj obj;

	public AccountTransferThread(Obj obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			synchronized (obj) {
				obj.acc2.withdraw(100000);
				System.out.println("100000 출금");
				obj.acc1.deposit(100000);
				System.out.println("100000 입금");
				
			}
		}
	}
}
