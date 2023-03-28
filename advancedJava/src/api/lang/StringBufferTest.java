package api.lang;
// String은 원본이 변경되지 않고 String메소드 호출의 결과가 새로운 String객체로 만들어져서 리턴한다.
// StringBuffer는 원본이 변경된다.
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		StringBuilder sbuilder = new StringBuilder("java programming");
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		// 문자열 뒤에 추가하기
		sb.append("재밌다.");
		sbuilder.append("재밌다.");
		
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		//문자열 중간에 삽입하기
		sb.insert(2, "servlet");
		sbuilder.insert(5, "servlet");
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		// 문자열 삭제
		sb.delete(2, 5);
		sbuilder.delete(4, 8);
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		sb.reverse();
		sbuilder.reverse();
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
	}
}
