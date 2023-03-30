package jdbc.table;

public interface BoardDAO {
	public int insert(String id, String title, String content);
	public int update(String id, int BoardNum, String title, String content);
	public int delete(int BoardNum);
}
