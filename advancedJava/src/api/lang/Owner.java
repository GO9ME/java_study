package api.lang;

public class Owner {
	private String name;
	private String cellPhone;

	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		Owner o = (Owner) obj;
		if (this.name.equals(o.name)) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

}
