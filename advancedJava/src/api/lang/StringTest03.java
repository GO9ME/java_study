package api.lang;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("java programming");
		String str2 = "재밌다";
		System.out.println(str1.startsWith("java"));
		System.out.println(str1.startsWith("test"));
		System.out.println(str1.endsWith("ing"));
		System.out.println(str1.endsWith("test"));
		System.out.println(str1.contains("test"));
		System.out.println(str1.contains("ja"));
	
		//대소문자 변환
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,8));
		System.out.println(str1.replace('a','A'));
	}

}
