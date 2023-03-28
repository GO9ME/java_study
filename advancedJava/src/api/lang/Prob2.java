package api.lang;

public class Prob2 {

	public static void main(String args[]) {
		
		Prob2 prob2 = new Prob2();
		
		System.out.println( prob2.leftPad("SDS", 8, '#') );
		System.out.println( prob2.leftPad("SDS", 7, '$') ); 
		System.out.println( prob2.leftPad("SDS", 5, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		
		/*  여기에 프로그램을 완성하십시오. */
		int length = size - str.length();
		String strArr = "";
		for ( int i = 0 ; i < length; i++) {
			strArr += padChar;
		}
		strArr += str;
		return strArr;
	}
	
}
