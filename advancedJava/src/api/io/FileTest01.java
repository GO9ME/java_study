package api.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// File 클래스이 API에 대해서 살펴보기
// -> file 과 directory를 자바에서 제어하기 위해 제공되는 클래스
public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("src/data/test.txt");
		File file2 = new File("src/data");
		System.out.println(file); // toString메소드가 생략됨(파일의 path를 출력하도록 오버라이딩)
		System.out.println("file.canRead()=>"+file.canRead());
		System.out.println("file.canWrite()=>"+file.canWrite());
		System.out.println("file.getAbsolutePath()=>"+file.getAbsolutePath());
		System.out.println("file.getName()=>"+file.getName());
		System.out.println("file.getParent()=>"+file.getParent());
		System.out.println("file.getPath()=>"+file.getPath());
		
		System.out.println("file.isDirectory()=>"+file.isDirectory());
		System.out.println("file.isFile()=>"+file.isFile());
		System.out.println("file2.isDirectory()=>"+file2.isDirectory());
		System.out.println("file2.isFile()=>"+file2.isFile());
		
		System.out.println("file.lastModified()=>"+file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date(file.lastModified());
		System.out.println(sdf.format(date));
		System.out.println("file.length()=>"+file.length());
//		file.setReadOnly();
		
		
	}
}
