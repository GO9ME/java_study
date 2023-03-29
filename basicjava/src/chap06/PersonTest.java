package chap06;
// Person 클래스를 테스트하기위한 클래스
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "RM";
		p.addr = "서울";
		p.setAge(30);
		
		System.out.println("성명:"+p.name);
		System.out.println("주소:"+p.addr);
		System.out.println("나이:"+p.getAge());
		
		System.out.println("================================");
		
		Person p2 = new Person();
		p2.name = "뷔";
		p2.addr = "인천";
		p2.setAge(28);
		
		System.out.println("성명:"+p2.name);
		System.out.println("주소:"+p2.addr);
		System.out.println("나이:"+p2.getAge());
		
	}

}
