package chap06.oop.constructor;

public class Account {
	private String accNo;
	private int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void save(int price) {
		this.balance = this.balance + price;
		System.out.println(accNo + " 계좌에 " + price + "만원이 입금되었습니다.");
	}

	public void deposit(int price) {
		this.balance = this.balance - price;
		System.out.println(accNo + " 계좌에 " + price + "만원이 출금되었습니다.");
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
