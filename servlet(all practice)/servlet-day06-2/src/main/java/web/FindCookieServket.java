package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FindCookieServket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(
			HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException,
					IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = 
				request.getCookies();
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				Cookie c = cookies[i];
				String name = c.getName();
				String value = URLDecoder.decode(c.getValue(), "utf-8");
				out.print(name + " " + value + "</br>" );
			}
		}else{
			out.print("沒有找到任何cookie");
		}
		
		
	}

}
