package thread.sync;

public class ThreadSyncTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obj obj = new Obj();
		obj.acc1 = new Account("111-222-333",10000000,"김서연");
		obj.acc2 = new Account("777-777-777",50000000,"BTS");
		
		AccountTransferThread t1 = new AccountTransferThread(obj);
		Thread t2 = new Thread(new AccountSumThread(obj));
	
		t1.start();
		t2.start();
	}

}
