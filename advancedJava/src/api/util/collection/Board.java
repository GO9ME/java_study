package api.util.collection;

import java.util.Date;

public class Board {
	private int num;
	private String name;
	private String title;
	private Date regDate;
	private String content;

	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Board(int num, String name, String title, String content) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.regDate = new Date();
		this.content = content;
	}


	@Override
	public String toString() {
		return "Board [num=" + num + ", name=" + name + ", title=" + title + ", regDate=" + regDate + ", content="
				+ content + "]";
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
