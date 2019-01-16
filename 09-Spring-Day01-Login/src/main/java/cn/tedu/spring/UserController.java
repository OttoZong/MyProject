package cn.tedu.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping("/login.do")
	public String showLogin(){
		
		return "login";
	}
	@RequestMapping("/handleLogin.do")
	public String handleLogin(
			String username,
			String password,
			ModelMap modelMap){
		
		//聲明登入結果.
		String result;
		
		//判斷用戶名.
		if("tomcat".equals(username)){
			//用戶名正確.
			if("123456".equals(password)){				
				//密碼也正確.則登入成功.
				result = "登入結果: 登入成功!";
			}else{
				//密碼錯誤,登入失敗.
				result = "登入結果: 密碼錯誤,登入失敗!";
			}			
		}else {
			//用戶名錯誤,登入失敗.
			result = "登入結果: 用戶名錯誤,登入失敗!";
		}
		
		//將需要轉發的數據封裝到ModelMap中.
		modelMap.addAttribute(
				"result",result);
		
		//執行轉發		
		return "login_result";		
	}
	
	
//	@RequestMapping("/handleLogin.do")
//	public ModelAndView handleLogin(
//			String username,
//			String password){
//		
//		//聲明登入結果
//		String result;
//		
//		//判斷用戶名.
//		if("tomcat".equals(username)){
//			//用戶名正確.
//			if("123456".equals(password)){				
//				//密碼也正確.則登入成功.
//				result = "登入成功!";
//			}else{
//				//密碼錯誤,登入失敗.
//				result = "密碼錯誤,登入失敗!";
//			}			
//		}else {
//			//用戶名錯誤,登入失敗.
//			result = "用戶名錯誤,登入失敗!";
//		}
//		//將result封裝，以準備轉發到jsp.
//		String viewName = "login_result";
//		Map<String, Object> model 
//			=new HashMap<String, Object>();
//		model.put("result", result);
//		ModelAndView mav = new ModelAndView(viewName, model);
//		
//		//返回,執行轉發
//		return mav;
//	}
	
}
