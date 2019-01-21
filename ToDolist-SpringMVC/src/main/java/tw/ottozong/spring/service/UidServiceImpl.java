package tw.ottozong.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tw.ottozong.spring.bean.Uid;
import tw.ottozong.spring.dao.IUidDao;

@Service("uidService")
public class UidServiceImpl implements IUidService{
	
	@Resource
	private IUidDao uidDao;

	public Integer newTodolist(Uid uid) {
		//1.查詢新用戶的用戶在數據表中對應的數據.
		Uid u = uidDao
				.findUserByUsername(
						uid.getUsername());		
		//2.判斷查詢結果
		if(u == null){
			//查詢結果為null,表示用戶名還沒有被占用.
			//則可以註冊
			return uidDao.insert_list(uid);
		}else{
			//查詢到匹配的用戶數據,即用戶名已經存在
			//不允許註冊
			return -1;
		}
		
	}	
}