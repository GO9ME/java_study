package jdbc.table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.dao.CustomerVO;
import jdbc.dao.DBUtil;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_board values (null,?,?,?,sysdate(),0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
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
	public int update(String id, int boardNum, String title, String content) {
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
			ptmt.setInt(4, boardNum);
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

	@Override
	public ArrayList<BoardDTO> searchTitle(String title) {
		// TODO Auto-generated method stub
		ArrayList<BoardDTO> boardList = new ArrayList<>();
		BoardDTO board = null;
		String sql = "SELECT * FROM tb_board WHERE title like ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, "%" + title + "%");

			rs = ptmt.executeQuery();
			// 조회한 레코를 VO로 변환해서 ArrayList에 담는 작업을 처리
			while (rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
				boardList.add(board);
			}
			System.out.println("조회한 레코드 개수 : " + boardList.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardList;
	}

	@Override
	public BoardDTO readBoard(int boardNum) {
		// TODO Auto-generated method stub
		BoardDTO board = null;
		String sql = "SELECT * FROM tb_board WHERE boardNum = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardNum);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
			} else {
				System.out.println("해당번호가 없습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return board;
	}

	@Override
	public ArrayList<BoardDTO> searchAll() {
		// TODO Auto-generated method stub
		ArrayList<BoardDTO> boardList = new ArrayList<>();
		BoardDTO board = null;
		String sql = "SELECT * FROM tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			rs = ptmt.executeQuery();
			// 조회한 레코를 VO로 변환해서 ArrayList에 담는 작업을 처리
			while (rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
				boardList.add(board);
			}
			System.out.println("조회한 레코드 개수 : " + boardList.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardList;
	}

}
