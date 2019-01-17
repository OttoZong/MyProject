package cn.tedu.spring.dao;

import cn.tedu.spring.bean.User;

public interface IUserDao {
	
	/**
	 * 新增用戶數據
	 * @param user
	 * @return 新增的用戶的id
	 * 			如果新增失敗,返回-1.
	 * 
	 */
	Integer insert(User user);
	
	/**
	 * 根據用戶名查詢用戶信息.
	 * 
	 * @param 用戶名
	 * @return 查詢到的用戶數據,
	 * 	如果沒有查詢到匹配的數據,則返回null.
	 */
	User findUserByUsername(String username);
	
}
