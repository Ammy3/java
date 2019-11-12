package nuc.ss.shopping.service;
import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.entity.UserDataSet;

public class UserDaolmpl implements UserDao {
	
	@Override
	public User[] queryAllUsers() {
		// TODO 自动生成的方法存根
		return UserDataSet.getUsers();
	}

	@Override
	public User queryUserById(String id) {
		// TODO 自动生成的方法存根
		User[] users=UserDataSet.getUsers();
		for (User use : users) {
			if (use.getId().equals(id))
				return use;
		}
		return null;
	}

	@Override
	public User login(String id, String password) {
		// TODO 自动生成的方法存根
		User[] users=UserDataSet.getUsers();
		for (User use : users) {
			if (use.getId().equals(id)) {
				if(use.getPassword()==password)
				return use;
			}else {
				return null;
			}
		}
		return null;
	}

	@Override
	public boolean register(User user) {
		// TODO 自动生成的方法存根
		return UserDataSet.addUser(user);
  }
}
