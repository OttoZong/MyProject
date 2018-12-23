package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Find_addCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(
			HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException,
					IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = 
				response.getWriter();
		Cookie[] cookies =
				request.getCookies();
		if(cookies!= null){
			boolean flag = false;
			for(int i =0; i<cookies.length; i++){
				Cookie c = cookies[i];
				String name = c.getName();
				String value = c.getValue();
				if("cart".equals(name)){
					out.println(value);
					flag = true;
				}
			}
			if(!flag){
				//沒有找到名稱為cart的cookie
				Cookie c = new Cookie("cart","1,2,3");
				response.addCookie(c);
			}
		}else{
			//沒有找到任何cookie
			Cookie c = new Cookie("cart","1,2,3");
			response.addCookie(c);			
		}
		
	}

}
