package chap05;

public class ArgsExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 명령형 매개 변수로 문자열을 입력받아 작업하기
		// 입력같이 "int" 이면 int형 배열을 만들고(5)
		// 1 ~ 10 까지 Random 수를 저장

		// "String"이면 string 형 배열을 만들고 (3)
		// "java" 문자열을 저장
		if (args.length == 1) {
			//int 값을 받을때
			if ((args[0].compareTo("int")) == 0) {
				int[] intArr = new int[5];
				for (int i = 0; i < intArr.length; i++) {
					intArr[i] = (int) (Math.random() * 10) + 1;
				}
				for (int i = 0; i < intArr.length; i++) {
					System.out.print(intArr[i] + "\t");
				}
			//String 값을 받을때
			} else if ((args[0].compareTo("String")) == 0) {
				String[] strArr = new String[3];
				for (int i = 0; i < strArr.length; i++) {
					strArr[i] = "java";
				}
				for (int i = 0; i < strArr.length; i++) {
					System.out.print(strArr[i] + "\t");
				}

			}
		} else {
			System.out.println("값을 입력해주세요");
		}
	}

}
