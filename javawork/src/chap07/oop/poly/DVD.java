package chap07.oop.poly;

public class DVD extends Content {
	private String genre;

	public DVD(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	public final String getGenre() {
		return genre;
	}

	public final void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub
		switch (this.genre) {
		case "new":
			setPrice(2000);
			break;
		case "comic":
			setPrice(1500);
			break;
		case "child":
			setPrice(1000);
			break;
		default:
			setPrice(500);
			break;
		}

	}

}
