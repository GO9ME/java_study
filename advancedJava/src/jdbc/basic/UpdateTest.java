package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "1234";

 
		String sql = "UPDATE customer SET addr = '서울특별시' WHERE addr = '서울'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!!");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("커넥션 성공!");
			Statement stmt = con.createStatement();
			System.out.println("Statement 객체 : " + stmt);
			int result = stmt.executeUpdate(sql);
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