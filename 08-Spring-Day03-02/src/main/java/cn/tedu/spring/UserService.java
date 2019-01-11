package cn.tedu.spring;

public class UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void reg() {
		System.out.println(
			"UserService.reg()");
		userDao.insert();
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

}
