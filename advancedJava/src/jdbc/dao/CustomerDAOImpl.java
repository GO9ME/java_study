package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		// TODO Auto-generated method stub
		String sql = "insert into customer values (?,?,?,?,sysdate(),1000,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
//			Statement stmt = con.createStatement();
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}

		System.out.println("MySQL INSERT");
		return result;
	}

	@Override
	public int update(String id, int point, String pass) {
		// TODO Auto-generated method stub

		String sql = "UPDATE customer SET point = ?, pass = ? WHERE id = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();

			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, point);
			ptmt.setString(2, pass);
			ptmt.setString(3, id);

			result = ptmt.executeUpdate();
			System.out.println("수정된 행 수 : " + result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}

		return result;

	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM customer WHERE id = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);

			result = ptmt.executeUpdate();
			System.out.println("수정된 행 수 : " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public void select(String addr) {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM customer WHERE addr like ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, "%" + addr + "%");

			rs = ptmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.println(rs.getInt(6) + "\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
	}

	@Override
	public void login(String id, String pass) {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM customer WHERE id = ? and pass = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				do {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getString(5) + "\t");
					System.out.print(rs.getString(6) + "\t");
				} while (rs.next());
			} else {
				System.out.println("로그인 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
	}

}
