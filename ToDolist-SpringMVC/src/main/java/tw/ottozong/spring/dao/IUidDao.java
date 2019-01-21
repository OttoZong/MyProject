package tw.ottozong.spring.dao;

import tw.ottozong.spring.bean.Uid;

public interface IUidDao {
	/**
	 * 新增todolist id
	 * 
	 * @param uid
	 * @return 新增的用戶的id 如果新增失敗,返回-1.
	 */
	Integer insert_list(Uid uid);

	
	
	
	/**
	 * 根據用戶名查詢用戶信息.
	 * 
	 * @param 用戶名
	 * @return 查詢到的用戶數據, 如果沒有查詢到匹配的數據,則返回null.
	 */
	Uid findUserByUsername(String username);

	/**
	 * 刪除id Data
	 * 
	 * @param id
	 * @return 刪除該id 如果沒有這條uid,則返回null.
	 */
	Uid delData(Uid uid);
}
