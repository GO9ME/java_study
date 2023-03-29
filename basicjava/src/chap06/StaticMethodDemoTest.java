package chap06;

import java.util.Random;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo obj = new StaticMethodDemo();
		System.out.println(StaticMethodDemo.staticNum);
		System.out.println("====================================");
		StaticMethodDemo obj2 = new StaticMethodDemo();
		
		// static 멤버는 클래스명.메소드명()
		StaticMethodDemo.test();
		obj2.display();
		StaticMethodDemo.show();
		obj2.change();
		
		int num = Integer.parseInt("100");
		Random rand = new Random();
		int num2 = rand.nextInt();
		System.out.println("num->"+num+",num2->"+num2);
	}
}
