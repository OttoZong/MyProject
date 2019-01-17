package cn.tedu.spring.service;

import cn.tedu.spring.bean.User;

public interface IUserService {

	/**
	 * 註冊新用戶
	 * @param user 新用戶的信息
	 * @return 新用戶的ID,如果註冊失敗,則返回-1.
	 */
	 Integer register(User user);
	 
	 /**
	  * 根據用戶名查詢用戶信息
	  * 
	  * @param 用戶名
	  * @return	查詢到的用戶數,
	  * 	如果沒有查詢到匹配的紀錄,則返回null.
	  */
	 User findUserByUsername(String username);
	
}
