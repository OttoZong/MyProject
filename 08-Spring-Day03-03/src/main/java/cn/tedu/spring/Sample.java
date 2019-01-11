package cn.tedu.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {
	
	public static void main(String[] args) {
		//1.加載Spring配置,獲取Spring容器.
		AbstractApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.獲取對象
		UserService us
			= ac.getBean("userService",UserService.class);
		//3.測試
		us.reg();
		//4.釋放資源
		ac.close();
		
		
	}
	
}
