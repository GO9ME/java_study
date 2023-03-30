package jdbc.table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.dao.DBUtil;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public int insert(String id, String title, String content) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_board values (null,?,?,?,sysdate(),0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
//			Statement stmt = con.createStatement();
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}

		return result;
	}

	@Override
	public int update(String id, int BoardNum, String title, String content) {
		// TODO Auto-generated method stub

		String sql = "UPDATE tb_board SET  title = ?, content = ? WHERE id = ? and boardNum = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);
			ptmt.setString(2, content);
			ptmt.setString(3, id);
			ptmt.setInt(4, BoardNum);
//			Statement stmt = con.createStatement();
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}

		return result;
	}

	@Override
	public int delete(int BoardNum) {
		String sql = "DELETE FROM tb_board WHERE boardNum = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, BoardNum);

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

}
