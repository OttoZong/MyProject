import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.bean.User;
import cn.tedu.spring.service.IUserService;

public class TestUserService {

	
	@org.junit.Test
	public void testRegister() {
		// 1. 加载Spring配置，获取Spring容器
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-mvc.xml");
		
		// 2. 获取IUserService的对象
		IUserService userService
			= ac.getBean("userService", IUserService.class);
		
		// 3. 测试功能
		User user = new User(
				0,
				"spring",
				"12345678",
				"1338800003",
				"tomcat@tedu.cn"
		);
		Integer uid = userService.register(user);
		System.out.println(
				"註冊完成,返回: " + uid);
		// 4. 释放资源
		ac.close();
	}
}
