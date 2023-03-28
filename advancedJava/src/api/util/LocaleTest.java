package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale[] locale = Locale.getAvailableLocales();
		for (Locale data : locale) {
//			System.out.println(data);
		}
//		Locale.Builder builder = new Locale.Builder();
//		builder = builder.setLanguage("en");
//		builder = builder.setRegion("US");
//		Locale locale2 = builder.build();
		Locale locale2 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Calendar cal = Calendar.getInstance(locale2); 
		System.out.println(cal.getTime());
		TimeZoneTest2.getInfo(cal);
		
		String[] countries = Locale.getISOCountries();
		for (String country : countries) {
			Locale locale3 = new Locale("en", country);
//			System.out.printf("2글자국가코드:%s | 3 글자국가코드 : %s | 영문국가이름 : %s | 한글국가이름 : %s %n", locale3.getCountry(),
//					locale3.getISO3Country(), locale3.getDisplayCountry(new Locale("en")), locale3.getDisplayCountry());
		}
	}

}
