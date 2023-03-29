package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
				String user = "exam";
				String password = "1234";
				String sql = "SELECT empno,ename,job,mgr,hiredate,sal FROM emp";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,user,password);
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()) {
//						System.out.println(rs.getString("id"));
						System.out.print(rs.getString(1) +"\t"); 
						System.out.print(rs.getString(2) +"\t"); 
						System.out.print(rs.getString(3) +"\t"); 
						System.out.print(rs.getString(4) +"\t"); 
						System.out.print(rs.getDate(5) +"\t"); 
						System.out.println(rs.getInt(6) +"\t"); 
					}
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
