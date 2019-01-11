package cn.tedu.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {
	public static void main(String[] args) {
		//1.指定配置文件.
		String fileName = "applicationContext.xml";
		
		//2.加載配置文件,獲得Spring容器.
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(fileName);
		
		//3.通過Spring容器獲取對象.
		Person p1 = ac.getBean("person",Person.class);
		Person p2 = ac.getBean("person",Person.class);
		Person p3 = ac.getBean("person",Person.class);
		Person p4 = ac.getBean("person",Person.class);
		System.out.println("捕獲對象完成! \n");
		
		
		//4.使用對象.
		System.out.println("p1:"+p1.hashCode());
		System.out.println("p2:"+p2.hashCode());
		System.out.println("p3:"+p3.hashCode());
		System.out.println("p4:"+p4.hashCode());
		System.out.println("使用對象完成! \n");
		
		//5.釋放對象.
		ac.close();
		System.out.println("釋放資源完成! \n");
	}
	
}
