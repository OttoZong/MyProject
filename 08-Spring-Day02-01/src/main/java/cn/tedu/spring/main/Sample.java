package cn.tedu.spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.service.UserService;
import cn.tedu.spring.service.ex.PasswordNotMatchExistException;
import cn.tedu.spring.service.ex.UsernameNotExistsException;

public class Sample {
	public static void main(String[] args) {
		//加載XML配置,獲取Spring容器.
		String fileName="applicationContext.xml";
		AbstractApplicationContext ac = 
				new ClassPathXmlApplicationContext(fileName);
		
		
		//創建UserService對象.
//		UserService userService = new UserService();		
		UserService userService =
				ac.getBean("userService",UserService.class);
		
		//模擬登陸的數據.
		String username = "tomcat";
		String password = "8080";
		
		//測試登陸功能.
		try {
			userService.login(username,password);
		} catch (PasswordNotMatchExistException e) {			
			System.out.println(e.getMessage());
		} catch (UsernameNotExistsException e) {			
			System.out.println(e.getMessage());
		}finally{
			ac.close();
			System.out.println("程式運行結束!");
		}
	}
}
