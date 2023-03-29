package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest_Ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteTest_Ver2 obj = new DeleteTest_Ver2();
		Scanner key = new Scanner(System.in);
		
		System.out.print("아이디:");
		String id = key.next();
		obj.delete(id);
		
	}
	
	public void delete(String id) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "1234";
		String sql = "DELETE FROM customer WHERE addr = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);

			int result = stmt.executeUpdate();
			System.out.println("수정된 행 수 : " + result);
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
