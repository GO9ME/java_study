package api.lang;

public class StringExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		// str 문자열이 다음과 같이 출력되도록 작업하세요
		// [출력형식]
		// AVAJ
		String str2 = "";
		str = str.toUpperCase();
		for ( int i = str.length()-1 ; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
		
	}

}
