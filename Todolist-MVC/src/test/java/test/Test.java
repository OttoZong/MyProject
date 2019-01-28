package test;

import java.util.List;

import dao.UserDao;
import model.User;

public class Test {
	/**
	 * 調用lists將DAO的值打印出來.
	 * 
	 */
	public static void test1(){
		UserDao dao = new UserDao();
		List<User> lists = dao.findName();
		System.out.println("lists"+lists);
	}
	
	public static void main(String[] args) {
		test1();
	}
}
