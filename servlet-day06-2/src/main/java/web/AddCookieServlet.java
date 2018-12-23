package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,
					IOException {
		Cookie c = new Cookie("username","Giving");
		response.addCookie(c);
		
		Cookie c2 = new Cookie("city","bj");
		response.addCookie(c2);
	}

}
