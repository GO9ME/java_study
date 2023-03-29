package chap07.oop.poly;

public class SNSSender extends Sender {
	int length;
	public SNSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void send(){
		System.out.println(name+"전송이 완료 - 미리 등록한 본인의 SNS 계정에 보내기 완료");
	}
}
