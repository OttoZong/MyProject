package tw.ottozong.spring.service;

import tw.ottozong.spring.bean.Uid;

public interface IUidService {

	/**
	 * 新增ToDoList
	 * @param uid 用戶想新增的信息
	 * @return 用戶的想新增的信息,如果失敗,則返回-1
	 */
	 Integer newTodolist(Uid uid);

	 
}
