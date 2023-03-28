package api.lang;

import java.util.Iterator;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaVersion = System.getProperty("java.version");
		String javaVendor = System.getProperty("java.vendor");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println(javaVersion);
		System.out.println(javaVendor);
		
		// 프로그램 실행시간
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("java");
		}
		
		//나노세컨드 - JVM이 인식하는 현재 시간의 값을 나노세컨드로 반환
		// 1/1000000000
		long end = System.currentTimeMillis();
		System.out.println("실행시간:"+(end-start));
	}

}
