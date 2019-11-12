package nuc.ss.shopping.entity;

public class UserDataSet {
	private static UserDataSet instance = new UserDataSet();
	private static User[] users;
	
	private UserDataSet() {
		 
	}

	public static void init() {
		users = new User[50];
		for(int i = 0; i < users.length; i++) {
			users[i] = null;
		}
		users[0] = new User("u01", "郑光荣", "123456", (byte)1, "太原");
		users[1] = new User("u02", "李欣媛", "123123", (byte)0, "北京");			
	}

	public static boolean addUser(User use) {
		int i;
		for (i = 0; i < 50; i++) {
			if (users[i] == null) {
				users[i] = new User();
				break;
			}
		}
		if (i < users.length) {
			users[i].setName(use.getName());
			users[i].setId(use.getId());
			users[i].setSex(use.getSex());
			users[i].setCity(use.getCity());
			users[i].setPassword(use.getPassword());
			users[i].toString();
			return true;
		} else {
			return false;
		}	
	}
	
	public static User[] getUsers() {
		return users;
	}
	
	public static UserDataSet getInstance() {
		return instance;
	}
	
}


