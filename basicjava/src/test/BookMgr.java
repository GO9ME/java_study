package test;

public class BookMgr {
//	private Book[] booklist = new Book[5];
	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist.clone();
//		for (int i = 0 ; i< booklist.length; i++) {
//			this.booklist[i] = booklist[i];
//		}
	}
	
	public void printBooklist(){
		for (int i = 0 ; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int sum = 0;
		for ( int i = 0 ; i< booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 핪:"+sum);

	}
}
