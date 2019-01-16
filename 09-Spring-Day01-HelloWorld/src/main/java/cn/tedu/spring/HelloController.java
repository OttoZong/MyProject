package cn.tedu.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public ModelAndView handleRequest(
			HttpServletRequest arg0, 
			HttpServletResponse arg1) 
					throws Exception {
		//創建ModelAndView對象.
		ModelAndView mav = new ModelAndView();
		
		//指定View組件名.
		mav.setViewName("hello");
		
		//返回
		return mav;
	}
	@RequestMapping("/login.do")
	public String ShowLogin(){
		return "login";
		
	}

}
