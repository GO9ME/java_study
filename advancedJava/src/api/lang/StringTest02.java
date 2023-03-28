package api.lang;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("java programming");
		String str2 = "재밌다";
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.indexof('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexof('합')=>"+str1.indexOf("합"));
		System.out.println("str1.lastIndexof('a')=>"+str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexof('합')=>"+str1.lastIndexOf("합"));
		System.out.println("str1.length=>"+str1.length());
	
		System.out.println("str1.equals(\"java programing\")"+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java Programing\")"+str1.equals("Java Programming"));

		System.out.println("str1.equalsIgnoreCase(\"java programing\")"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java Programing\")"+str1.equalsIgnoreCase("Java Programming"));
		
	}

}
