package cn.tedu.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component
public class HelloController 
	implements Controller{

	public ModelAndView handleRequest(
			HttpServletRequest arg0, 
			HttpServletResponse arg1) 
					throws Exception {
		
		//測試.
		System.out.println("HelloController.handleRequest()");
		
		
		//創建返回值對象.
		ModelAndView mav = new ModelAndView();
		//確定前端頁面.
		mav.setViewName("hello");
		//返回.
		return mav;
		
	}

}
