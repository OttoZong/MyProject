package base.controller;

import base.annotation.RequestMapping;

/**
 * 模型 
 * 
 * @author Otto
 *
 */          
public class HelloController {
	/**
	 * 返回值我們稱之為視圖名.
	 * 注:
	 * 	視圖名會對應某個jsp,
	 * 	這個對應關係由控制器來負責.
	 */
	@RequestMapping("/hello.do")
	public String hello(){
		System.out.println("HelloController's hello()");		
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String welcome(){
		System.out.println("HelloController's welcome()");
		return "welcome";
	}
	
	@RequestMapping("/hello2.do")
	public String hello2(){
		System.out.println("HelloController's hello2()");
		//重定向.
		return "redirect:welcome.do";
		
	}
}
