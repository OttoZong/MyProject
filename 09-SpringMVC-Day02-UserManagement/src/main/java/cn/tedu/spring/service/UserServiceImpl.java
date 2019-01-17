package cn.tedu.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tedu.spring.bean.User;
import cn.tedu.spring.dao.IUserDao;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private	IUserDao userDao;
	
	public Integer register(User user) {
		//1.查詢新用戶的用戶在數據表中對應的數據.
		User u = userDao
				.findUserByUsername(
						user.getUsername());		
		//2.判斷查詢結果
		if(u == null){
			//查詢結果為null,表示用戶名還沒有被占用.
			//則可以註冊
			return userDao.insert(user);
		}else{
			//查詢到匹配的用戶數據,即用戶名已經存在
			//不允許註冊
			return -1;
		}		
	}

	public User findUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}

}
