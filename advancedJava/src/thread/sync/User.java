package thread.sync;

public class User extends Thread {
	String name;
	Toilet toilet;
	
	public User(String name, Toilet toilet) {
		super();
		this.name = name;
		this.toilet = toilet;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		toilet.open(name);
	}
}
