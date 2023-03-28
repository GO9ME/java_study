package thread.sync;

public class Account {
	private String accId;
	private int balance;
	private String ownerName;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accNo, int balance, String ownerName) {
		super();
		this.accId = accNo;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	public void deposit(int price) {
		this.balance = this.balance + price;
		System.out.println(accId + " 계좌에 " + price + "만원이 입금되었습니다.");
	}

	public void withdraw(int price) {
		this.balance = this.balance - price;
		System.out.println(accId + " 계좌에 " + price + "만원이 출금되었습니다.");
	}

	public String getAccNo() {
		return accId;
	}

	public void setAccNo(String accNo) {
		this.accId = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
