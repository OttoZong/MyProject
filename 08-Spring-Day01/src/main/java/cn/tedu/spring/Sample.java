package cn.tedu.spring;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Sample {

	// 請寫出Java程序的入口函數的Signature.
	public static void main(String[] args) {
		//普通的創建對象的方式
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		/***使用Spring創建對象***/
		//1.確定配置文件:文件名區分大小寫.
		String fileName = 				
				"applicationContext.xml";
		
		//2.加載配置文件，獲取String容器.
		ApplicationContext  ac 
			= new ClassPathXmlApplicationContext(fileName);
		
		//3.根據XML配置中的id名稱,
		 //從Spring 容量中獲得對象.
		Date d = (Date) ac.getBean("date");
		//4.測驗.
		System.out.println("從Spring容器中獲取id=date的對象:"+d);
		
		//3.根據XML配置中的id名稱,
		 //從Spring 容量中獲得對象.
		Calendar c =(Calendar) ac.getBean("date");
		//4.測驗.	
		System.out.println("從Spring容器中獲取id=date對象"+c);
	}

	private static ApplicationContext ClassPathXmlApplicationContext() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
