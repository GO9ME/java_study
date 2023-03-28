package api.lang;


public class Prob3 {
	public static void main(String[] args) {
		Prob3 p = new Prob3();
		String addr = "서울특별시,강남구,언주로,멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		String [] arr = new String[str.length()];
		int size = 1; // 배열 사이즈
		int k = 0; // 문자열 담을 인덱스
		String strArr = "";
		for (int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == separator) {
				size++;
				strArr = "";
				k++;
			} else {
				strArr += str.charAt(i);
			}
			arr[k] = strArr;
		}
		
		String [] result = new String [size];
		System.arraycopy(arr, 0, result, 0, size);
		
		return result;
		
	}
}


















