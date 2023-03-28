package api.lang;

public class ObjectTest {
	public static void main(String[] args) {
		// equals는 하위클래스에서 객체의 속성을 비교해서 같은 객체인지 여부를 boolean으로 리턴하도록 정의
		Object obj1 = new Object();
		Object obj2 = new Object();
		if (obj1 == obj2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
		// hashCode는 객체가 할당된 메모리를 기준으로 값을 계산해서 리턴하므로 모두 다른값을 리턴
		
		System.out.println(obj2);
		System.out.println(obj2.hashCode());

	}
}
