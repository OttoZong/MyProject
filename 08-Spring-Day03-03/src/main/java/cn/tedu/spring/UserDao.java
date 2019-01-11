package cn.tedu.spring;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public void insert(){
		System.out.println("UserDao.insert()");
	}
	
}
