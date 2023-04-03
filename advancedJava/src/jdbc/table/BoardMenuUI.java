package jdbc.table;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.dao.CustomerVO;

public class BoardMenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		BoardDTO board = new BoardDTO(id, title, content);
		dao.insert(board);
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		key.nextLine();
		System.out.print("글제목:");
		String title = key.nextLine();
		System.out.print("글내용:");
		String content = key.nextLine();
		//여기에서 BoardDAO의 메소드를 호출하세요
		dao.update(id, boardNum, title, content);
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		dao.delete(boardNum);
	}
	public void searchMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardDTO> boardList = dao.searchTitle(title);
		int size = boardList.size();
		for (int i = 0; i < size; i++) {
			BoardDTO board = boardList.get(i);
			System.out.println(board.getBoardNum() + "\t");
			System.out.print(board.getId() + "\t");
			System.out.print(board.getTitle() + "\t");
			System.out.print(board.getContent() + "\t");
			System.out.print(board.getWriteDate() + "\t");
			System.out.print(board.getHit() + "\t");
		}
	}
	
	public void readMenu(){
		System.out.println("*******게시글상세조회********");
		System.out.print("글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		BoardDTO board = dao.readBoard(boardNum);
		if (board != null) {
			System.out.print(board.getBoardNum() + "\t");
			System.out.print(board.getId() + "\t");
			System.out.print(board.getTitle() + "\t");
			System.out.print(board.getContent() + "\t");
			System.out.print(board.getWriteDate() + "\t");
			System.out.print(board.getHit() + "\t");
		} else {
			System.out.println("해당 게시물 없음");
		}
		
	}
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardDTO> boardList = dao.searchAll();
		int size = boardList.size();
		for (int i = 0; i < size; i++) {
			BoardDTO board = boardList.get(i);
			System.out.println(board.getBoardNum() + "\t");
			System.out.print(board.getId() + "\t");
			System.out.print(board.getTitle() + "\t");
			System.out.print(board.getContent() + "\t");
			System.out.print(board.getWriteDate() + "\t");
			System.out.print(board.getHit() + "\t");
		}
		
	}
}


















