package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "1234";
 
 
		String sql = "insert into customer values('lee','1234','이민호','서울',sysdate(),1000,'신의짱')";
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!!");
			// 2. DB접속
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("커넥션 성공!");
			// 3. SQL을 실행하기 위해서 Statement객체를 생성하기
			Statement stmt = con.createStatement();
			System.out.println("Statement 객체 : " + stmt);
			// 4. SQL문을 실행
			int result = stmt.executeUpdate(sql);
			// 5. 결과처리
			System.out.println(result+"개 행 삽입성공!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패!!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
