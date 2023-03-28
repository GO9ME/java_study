package api.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// File 객체를 활용한 에제
public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/data");
		// file 객체의 내부에 있는 파일과 모든 폴더를 출력
		// test --------[폴더]
		// ....
		// score.txt ------- [파일(15:2023/03/10)]
		// ....
		// 파일사이즈 마지막으로 수정한 날짜
		// 1. 지정한 file객체의 내부정보를 받아올수있는 메소드를 찾기
		// -> File클래스의 API에서 결과가 배열이나 자료구조인 메소드를 찾기

		File[] files = file.listFiles();

		for (File subfile : files) {
			if (subfile.isDirectory()) {
				System.out.println(subfile.getName() + "[폴더]");
			} else {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date(subfile.lastModified());
				System.out.println(subfile.getName()+"[파일("+subfile.length()+"):"+sdf.format(date) +")]");
			}
		}
	}

}
