package api.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(c);
		Date d = new Date();
		System.out.println(d);
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.print(cal.get(Calendar.HOUR) + "시 ");
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		System.out.println(cal.get(Calendar.SECOND) + "초 ");
		
		// 오늘부터 6/18일까지 d-day계산해보기
		cal.set(2023, 6-1, 18);
		long day =  ((cal.getTimeInMillis() - cal2.getTimeInMillis()) / (60 * 60 * 24 * 1000));
		System.out.println("dday:"+ day);
	}
}
