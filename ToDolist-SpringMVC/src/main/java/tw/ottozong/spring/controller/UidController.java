package tw.ottozong.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.ottozong.spring.service.IUidService;

@Controller
public class UidController {
	
	@Resource(name="uidService")
	private IUidService uidService;
	
//	@RequestMapping("/register.do")
//	public String showRegister(){	
//		return "register";
//	}
//	
//	@RequestMapping("/login.do")
//	public String showLogin(){	
//		return "login";
//	}
	
	@RequestMapping("Demo.do")
	public String showTodolist(){		
		return "Demo";
	}
	
}
