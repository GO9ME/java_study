package jdbc.dao;

import java.sql.Date;

// 테이블의 레코드 하나를 표현해 놓은 객체
// DTO(Data Transfer Object), VO(Value Object) 객체라고 부름
// -> 계층간의 데이터를 교환히기 위해서 생성
// 어떤 비지니스 로직을 담고 있지 않고 순수하게 값을 표현해 놓은 객체
// 사용자가 입력한 데이터를 담아서 서버로 전송
// 서버에서 발생한 데이터를 담아서 뷰로 전송
public class CustomerVO {
	// 맴버 변수는 레코드의 컬럼을 정의
	private String id;
	private String pass;
	private String name;
	private String addr;
	private Date regdate;
	private int point;
	private String memo;
	
	public CustomerVO() {
		
	}
	
	
	public CustomerVO(String id, String pass, String name, String addr, String memo) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.memo = memo;
	}



	public CustomerVO(String id, String pass, String name, String addr, Date regdate, int point, String memo) {
		this(id, pass, name, addr, memo);
		this.regdate = regdate;
		this.point = point;
	}


	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", regdate=" + regdate
				+ ", point=" + point + ", memo=" + memo + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
