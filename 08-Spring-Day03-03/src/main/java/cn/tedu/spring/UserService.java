package cn.tedu.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserService {	
	@Resource
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void reg(){
		System.out.println("UserService.reg()");
		userDao.insert();
	}
	
}
