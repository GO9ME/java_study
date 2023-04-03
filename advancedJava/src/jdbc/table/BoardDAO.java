package jdbc.table;

import java.util.ArrayList;

public interface BoardDAO {
	public int insert(BoardDTO board);
	public int update(String id, int boardNum, String title, String content);
	public int delete(int BoardNum);
	public ArrayList<BoardDTO> searchTitle(String title);
	public BoardDTO readBoard(int boardNum);
	public ArrayList<BoardDTO> searchAll();
}
