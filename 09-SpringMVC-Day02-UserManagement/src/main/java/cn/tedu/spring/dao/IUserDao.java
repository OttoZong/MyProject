package cn.tedu.spring.dao;

import cn.tedu.spring.bean.User;

public interface IUserDao {
	
	/**
	 * 新增用戶數據
	 * @param user
	 * @return 新增的用戶的id
	 * 
	 */
	Integer insert(User user);
	
	
}
