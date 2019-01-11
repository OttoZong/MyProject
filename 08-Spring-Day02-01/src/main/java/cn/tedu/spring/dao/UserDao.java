package cn.tedu.spring.dao;

import cn.tedu.spring.bean.User;

public class UserDao {

	
	/**
	 * 增加用戶數據到數據庫
	 * @param user 被增加的數據.
	 * @return 新增數據的id
	 */
	public int insert(User user){
		return 1;
	}
	
	/**
	 * 根據用戶名查詢用戶數據
	 * @param username 用戶名
	 * @return 與用戶名匹配的用戶數據,
	 * 			如果查詢失敗,則返回null
	 */
	public User findUserByUsername(String username){
		//以下是模擬數據.
		//如果查詢的用戶是admin,返回有效數據.
		if("admin".equals(username)){
			User user = new User();
			user.setUsername("admin");
			user.setPassword("123456");
			return user;
		}
		
		return null;
	}
}
