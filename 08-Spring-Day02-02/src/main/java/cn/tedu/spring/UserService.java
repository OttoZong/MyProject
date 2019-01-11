package cn.tedu.spring;

public class UserService {
	
	//聲明類型為UserDao的屬性.
	//這個屬性不需要賦值.
	//推薦使用userDao作為屬性的名稱.
	//當習慣了這樣的命名以後
	//相關的配置也使用同樣的命名風格
	//則便於統一,不易出錯.
	private IUserDao userDao;
	
	// 與屬性名稱匹配的SET方法.
	// 後續Spring會自動調用該方法為屬性賦值.
	public void setUserDao(IUserDao userDao){
		this.userDao = userDao;
	}
	
	//模擬調用Dap工作的方法.
	public void reg(){
		//日誌.
		System.out.println("UserService.reg()");
		//調用Dao工作.
		userDao.insert();
	}
}
