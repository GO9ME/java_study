package thread.sync;

public class ThreadSyncTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toilet toilet = new Toilet();
		
		User user1 = new User("장동건", toilet);
		User user2 = new User("이민호", toilet);
		User user3 = new User("공유", toilet);
		User user4 = new User("김범룡", toilet);
		User user5 = new User("이서진", toilet);
		User user6 = new User("박서준", toilet);
		User user7 = new User("장기용", toilet);
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();
	}

}
