package cn.tedu.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {
	
	public static void main(String[] args) {
		// 加載Spring配置,獲取Spring容器.
		String fileName =
				"applicationContext.xml";
		AbstractApplicationContext ac = 
				new ClassPathXmlApplicationContext(fileName);
		
		
		// 通過Spring容器獲取UserService的對象.
		UserService userService =
				ac.getBean(
						"userService",UserService.class);
		
		//測試
		userService.reg();
		
		//釋放資源.
		ac.close();
	}
}
