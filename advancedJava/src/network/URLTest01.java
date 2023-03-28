package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// URL 클래스 
// 웹상의 주소를 나타내는 클래스이고 이를 통해서 네트워크로 연결할 수 있고 웹상의 리소스를 가져올 수 있음
public class URLTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.naver.com");
//			URL url = new URL("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAxMjRfMjUz%2FMDAxNjc0NDg2ODgzNDg4.vv1Uq0lxrTXWyPfAETDQux-oVryMxko3uQvqSj0sRbEg.T4cZJOkQyqkth6BxiAQWsBC-b9CbZMzlnCrVa_R-H8sg.PNG.lthrk035%2F20230124_001429.png%2Fundefined&type=a340");
			System.out.println(url.toString());
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			// getPort -1 로 출력
			// -1 포트로 접속했다는 의미가 아니라 프로토콜에 등록되어 있는 기본 포트로 접속했다는 의미
			// http 프로토콜의 등록된 기본포트는 80
			System.out.println(url.getPort());
			System.out.println(url.getProtocol());
			System.out.println(url.getFile());
			
			
			// 지정한 url 로 접속해서 해당 자원을 읽는 작업을 수행
//			InputStream is = url.openStream();
//			System.out.println((char)is.read());
			// input을 하는 경우 한글이 있으면 BufferedReader를 사용, 바이너리 데이터면 BufferedInputStream
			// BufferedReader는 보조 스트림으로 inputstream을 리턴하는 openStream()의 호출 코드를 직접 전달 할 수 없으므로 
			// 중간에 InputStreamReader를 만들어서 전송
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			while (true) {
				String line = br.readLine();
				if ( line == null ) {
					break;
				}
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
