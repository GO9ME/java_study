package jdbc.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
	커넥션 관리 자원반납 모든 DB관련 메소드에서 공통으로 처리하는 부분을 구현
	DB연동과 관련된 기능을 유틸리티처럼 제공하는 클래스
	1. 드라이버 로딩
	2. DB 서버 연결
	3. 자원 반납
	

*/
public class DBUtil {
	// 드라이버 로딩 - DBUtil 클래스가 로딩될때 자동으로 드라이버가 로딩되도록 작업
	// -> Static{}에 정의한 코드는 DBUtil 클래스가 클래스 로더에 의해 메모리가 로딩될때 자동으로 실행
	// 따라서 코드가 한번 실행되도록 할수 있음
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnect() {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "1234";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
