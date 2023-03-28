package chap11.exception;

public class CheckingAccount extends Account {
	private String cardNo;

	
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	
	public void pay(long amount, String cardNo) {
		if (this.cardNo.equals(cardNo) && amount < getBalance()) {
			//setBalance(getBalance()-amount);
			withdraw(amount);
		} else {
			// 잔액이 부족한 경우 Exception이 발생할 수 있도록 처리하기
			// BankException을 만들어서 처리하기
			if (getBalance() < amount ) {
				try {
					throw new BankException("지불이 불가능합니다.");
				} catch (Exception e) {
					// TODO: handle exception				
//					System.out.println("예외처리완료");
//					System.out.printlna("=========================");
					System.out.println(e.getMessage());
				}
			}
//			System.out.println("지불이 불가능합니다.");
		}
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	
}
