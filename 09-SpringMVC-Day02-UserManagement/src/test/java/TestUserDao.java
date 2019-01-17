

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.bean.User;
import cn.tedu.spring.dao.IUserDao;



public class TestUserDao {

	@org.junit.Test
	public void testInsert() {
		// 1. 加载Spring配置，获取Spring容器
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-mvc.xml");
		
		// 2. 获取IUserDao的对象
		IUserDao userDao
			= ac.getBean("userDao", IUserDao.class);
		
		// 3. 测试功能
		User user = new User(
			0,
			"tomcat",
			"12345678",
			"13800138002",
			"tomcat@tedu.cn"
		);
		Integer uid = userDao.insert(user);
		System.out.println(
			"增加用户完成，返回：" + uid);
		
		// 4. 释放资源
		ac.close();
	}
	
	@org.junit.Test
	public void testFindUserByUsername() {
		// 1. 加载Spring配置，获取Spring容器
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-mvc.xml");
		
		// 2. 获取IUserDao的对象
		IUserDao userDao
			= ac.getBean("userDao", IUserDao.class);
		
		// 3. 测试功能
		String username = "spring";
		User user 
			= userDao.findUserByUsername(
				username);
		System.out.println(user);
		
		// 4. 释放资源
		ac.close();
	}
}
