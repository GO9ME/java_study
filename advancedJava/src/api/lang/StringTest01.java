package api.lang;
//  String 객체의 값 비교
public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("===============");

		if(str3 == str4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("===============");

		
		
	}
}
