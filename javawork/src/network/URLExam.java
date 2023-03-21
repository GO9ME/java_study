package network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹상에서 검색할 수 있는 이미지 리소스에 접속하고 파일로 저장하기
		// -> 이미지 다운로드
		// images 폴더에 myImg.jpg로 저장하기
		String imgUrl = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAxMjRfMjUz%2FMDAxNjc0NDg2ODgzNDg4.vv1Uq0lxrTXWyPfAETDQux-oVryMxko3uQvqSj0sRbEg.T4cZJOkQyqkth6BxiAQWsBC-b9CbZMzlnCrVa_R-H8sg.PNG.lthrk035%2F20230124_001429.png%2Fundefined&type=a340";
		URL url = null;
		InputStream in = null;
		OutputStream os = null;

		try {
			url = new URL(imgUrl);
			in = url.openStream();
			os = new FileOutputStream("src/images/myImg.jpg"); // 저장경로
			int data;
			while ((data = in.read()) != -1) {
				os.write(data);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if ( os != null) os.close();
				if ( in != null) in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
