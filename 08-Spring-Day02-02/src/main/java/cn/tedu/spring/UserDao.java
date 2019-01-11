package cn.tedu.spring;

public class UserDao implements IUserDao{
	
	public void insert(){
		System.out.println("UserDao.insert() -> 開始");
		System.out.println("UserDao.insert() -> 結束");
	}
}
