package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest_Ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateTest_Ver2 obj = new UpdateTest_Ver2();
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("포인트:");
		int point = Integer.parseInt(key.next());
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("아이디:");
		String id = key.next();
		obj.update(point, pass, id);
	}
	
	public void update(int point, String pass, String id) {

		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "1234";

 
		
		
		String sql = "UPDATE customer SET point = ?, pass = ? WHERE id = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, point);
			stmt.setString(2, pass);
			stmt.setString(3, id);

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