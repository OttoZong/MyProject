package base.controller;

import javax.servlet.http.HttpServletRequest;

import base.annotation.RequestMapping;

/**
 * 模型.
 * 
 * @author Otto
 *
 */
public class LoginController {
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		System.out.println("LoginController's toLogin()");
		return "login";
	}
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request){
		
		System.out.println("LoginController's login()");
		
		String username = 
				request.getParameter("username");
		String pwd = 
				request.getParameter("pwd");
		
		System.out.println("username:" + username + "pwd:" + pwd);
		
		return "redirect:welcome.do";
	}
	
}
