package cn.tedu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/index.do")
	public String showIndex() {
		return "index";
	}

	@RequestMapping("/login.do")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/user_center.do")
	public String showUserCenter() {
		return "user_center";
	}

}
