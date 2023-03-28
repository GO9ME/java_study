package api.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 출력되는 숫자와 날짜에 포맷을 적용할 수 있다
// -> 지정한 패턴에 맞게 출력
public class FormatTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// 날짜 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		String data = sdf.format(cal.getTime());
		System.out.println("format을 적용한 날짜 데이터 : " + data);

		// 숫자 출력
		DecimalFormat df = new DecimalFormat("#,###.##");
		System.out.println(df.format(12345.1234));
		
		String decimaldata = "12345.785";
		try {
			double num = (double) df.parse(decimaldata);
			System.out.println(df.format(num));
		} catch (ParseException e) {
			// TODO: handle exception
			
		} 
		
		
		
		
		
	}

}
