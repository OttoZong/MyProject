

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.bean.User;
import cn.tedu.spring.dao.IUserDao;



public class TestUserDao {

	@org.junit.Test
	public void testInsert(){
		//1.加載Spring配置,獲取Spring容器.
		AbstractApplicationContext ac =
				new ClassPathXmlApplicationContext("spring-mvc.xml");
		
		//2.獲取IUserDao對象.
		IUserDao userDao = 
				ac.getBean("userDao",IUserDao.class);
		
		//3.測試功能.
		String username = "admin";
		User user = new User(
				0,
				"admin",
				"123456",
				"133380001",
				"admin@tedu.cn"
		);
		
		Integer uid = userDao.insert(user);
		System.out.println("增加用戶完成,返回:"+uid);
		
		//4.釋放資源.
		ac.close();
	}
	
	@org.junit.Test
	public void testFindUserByUsername(){
		//1.加載Spring配置,獲取Spring容器.
		AbstractApplicationContext ac =
				new ClassPathXmlApplicationContext("spring-mvc.xml");
		
		//2.獲取IUserDao對象.
		IUserDao userDao = 
				ac.getBean("userDao",IUserDao.class);
		
		//3.測試功能.
		String username = "admin";
		User user = userDao.findUserByUsername(username);
		
		System.out.println(user);
		
		//4.釋放資源.
		ac.close();
	}
}
