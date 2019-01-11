package cn.tedu.spring.service;

import cn.tedu.spring.bean.User;
import cn.tedu.spring.dao.UserDao;
import cn.tedu.spring.service.ex.PasswordNotMatchExistException;
import cn.tedu.spring.service.ex.UsernameAlreadyExistsException;
import cn.tedu.spring.service.ex.UsernameNotExistsException;

public class UserService {
	/**
	 * UserDao的對象,
	 * 即訪問持久層(通常是數據庫)的對象.
	 * 
	 *private UserDao userDao = new UserDao();
	 */
	private UserDao userDao;
	
	//	使用Spring為userDao屬性賦值時
	//	必須存在該方法.
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//	使用Spring為userDao屬性賦值時,不是必需的方法.
	public UserDao getUserDao() {
		return userDao;
	}
	

	/**
	 * 註冊.
	 * @param user	嘗試註冊的用戶訊息.
	 * @throws UsernameAlreadyExistsException
	 * 當用戶名已經被註冊時將拋出此異常.
	 */
	public void reg(User user) throws UsernameAlreadyExistsException{
		//檢查用戶名是否被註冊.
		User u = userDao.findUserByUsername(user.getUsername());
		
		//檢查查詢結果,即用戶名是否已經被註冊
		if(u==null){
			//	沒有匹配用戶名的數據.
			//	即用戶名沒有被註冊.
			//	所以,此次允許註冊.
			userDao.insert(user);
		}else{
			//查詢到匹配的數據.
			//即用戶名已經被註冊.
			//所以,此次不允許被註冊.
			throw new UsernameAlreadyExistsException("用戶名已經被占用");
		}
	}
	/**
	 * 用戶登入.
	 * @param username	用戶名.
	 * @param password	密碼.
	 * @throws PasswordNotMatchExistException	用戶不存在.
	 * @throws UsernameNotExistsException		密碼錯誤.
	 */
	public void login(String username,String password) throws PasswordNotMatchExistException, UsernameNotExistsException{
		//根據用戶名查詢用戶數據.
		User u = userDao.findUserByUsername(username);
		// 判斷是否查詢到數據.
		if(u == null){
			//沒有查詢到用戶數據.
			//即用戶不存在,登入失敗.
			throw new UsernameNotExistsException("用戶名不存在"); 
		}else{
			// 用戶名存在,則判斷密碼.
			if(u.getPassword().equals(password)){
				//密碼匹配,則登入成功
			}else{
				//密碼不匹配,登陸失敗.
				throw new PasswordNotMatchExistException("密碼錯誤");
			}
		}
	}
}
