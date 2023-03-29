package chap07;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	public void deposit(long amount) {
		this.balance = balance + amount;
	}

	public void withdraw(long amount) {
		this.balance = balance - amount;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
