package chap04;

// for 문으로 표현했던 코드를 변환해보기
// 1부터 100까지 총합, 홀수합, 짝수합 구해서 출력하는 코드를 while문으로 변경해보자.(제출)
public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int oddsum = 0;
		int evensum = 0;

		int i = 1;
		while (i <= 100) {
			total = total + i;
			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}
			i++;
		}
		
		System.out.println("총합:" + total);
		System.out.println("홀수합:" + oddsum);
		System.out.println("짝수합:" + evensum);
	}

}
