package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {

//		ServletContext sc = getServletContext();
//		String username =
//				(String)sc.getAttribute("username");
//		System.out.println("username:"+ username);
		
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		System.out.println("username:" + username);		
	}

}
