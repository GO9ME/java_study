package basic;


public class TimeTest{
	public static void main(String[] args){
		int time = 8800;
		int min = time / 60; //전체를 분으로 나타냈을 때 
		int hour = min / 60; //시간
		int sec = time % 60; //초
		min = min % 60; //시간을 뺀 나머지 분
		
		String result = hour + "시간" + min + "분" + sec + "초";
		System.out.println(result);
	}
}