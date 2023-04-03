package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int insert(CustomerVO customer) {
		// TODO Auto-generated method stub
		String sql = "insert into customer values (?,?,?,?,sysdate(),1000,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setString(4, customer.getAddr());
			ptmt.setString(5, customer.getMemo());
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
	public ArrayList<CustomerVO> getMemberList() {
		ArrayList<CustomerVO> customerlist = new ArrayList<>();
		String sql = "SELECT * FROM customer";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		CustomerVO customer = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			rs = ptmt.executeQuery();
			// 조회한 레코를 VO로 변환해서 ArrayList에 담는 작업을 처리
			while (rs.next()) {
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
				customerlist.add(customer);
			}
			System.out.println("조회한 레코드 개수 : " + customerlist.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return customerlist;
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
	public ArrayList<CustomerVO> select(String addr) {
		// TODO Auto-generated method stub
		ArrayList<CustomerVO> customerlist = new ArrayList<>();
		String sql = "SELECT * FROM customer WHERE addr like ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		CustomerVO customer = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, "%" + addr + "%");

			rs = ptmt.executeQuery();
			// 조회한 레코를 VO로 변환해서 ArrayList에 담는 작업을 처리
			while (rs.next()) {
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
				customerlist.add(customer);
			}
			System.out.println("조회한 레코드 개수 : " + customerlist.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return customerlist;
	}

	@Override
	public CustomerVO login(String id, String pass) {
		// TODO Auto-generated method stub
		CustomerVO customer = null;
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
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
			} else {
				System.out.println("로그인 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return customer;
	}
	
	@Override
	public CustomerVO getCustomerInfo(String id) {
		// TODO Auto-generated method stub
		CustomerVO customer = null;
		String sql = "SELECT * FROM customer WHERE id = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
			} else {
				System.out.println("해당아이디가 없습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return customer;
	}

}
