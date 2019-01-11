package cn.tedu.spring;

public class UserDao2 implements IUserDao{
	
	public void insert(){
		System.out.println("UserDao2.insert() --> 開始");
		System.out.println("UserDao2.insert() --> 結束");
	}
}
