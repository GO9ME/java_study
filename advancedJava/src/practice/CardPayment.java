package practice;

public class CardPayment extends Payment {
	private String cardNumber;
	private String carPassword;
	private int monthlyInstallment;

	public CardPayment() {
		// TODO Auto-generated constructor stub
	}

	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String carPassword,
			int monthlyInstallment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.carPassword = carPassword;
		this.monthlyInstallment = monthlyInstallment;
	}

	@Override
	public String toString() {
		return "신용카드가 정상적으로 지불되었습니다.\n"
				+ "[ 신용카드 결제 정보 ]\n"
				+ "상점명 : " + shopName + "\n"
				+ "상품명 : " + productName + "\n"
				+ "상품가격 : " + productPrice + "\n"
				+ "신용카드번호 : " + cardNumber + "\n"
				+ "할부개월 : " + monthlyInstallment ;
	}

	@Override
	public void pay() throws PayException {
		// TODO Auto-generated method stub
		if (productPrice <= 0 || monthlyInstallment < 0) {
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCarPassword() {
		return carPassword;
	}

	public void setCarPassword(String carPassword) {
		this.carPassword = carPassword;
	}

	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}

	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}

}
