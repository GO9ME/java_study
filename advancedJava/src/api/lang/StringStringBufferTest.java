package api.lang;
// String과 StringBuffer의 성능 비교
public class StringStringBufferTest {

	// String으로 객체를 만드는 작업
	public static void stringCheck(int count) {
		long start = System.nanoTime();
		String str = new String("java");
		for ( int i = 0 ; i <= count; i ++) {
			str = str + "java";
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str=str+java");
		System.out.println("실행시간:"+time);
		System.out.println(str);
	}
	//StringBuffer로 객체를 만드는 작업
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer str = new StringBuffer("java");
		for ( int i = 0 ; i <= count; i ++) {
			str = str.append("java");
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str=str+java");
		System.out.println("실행시간:"+time);
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringCheck(10);
		stringBufferCheck(10);
	}

}
