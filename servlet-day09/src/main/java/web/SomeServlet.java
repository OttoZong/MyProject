package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SomeServlet
 */
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		/*
		 * 獲得ServletContext.
		 * 註:通過繼承自GenericServlet提供的
		 * getServletContext方法.
		 * 
		 */
		ServletContext sc = getServletContext();
		sc.setAttribute("username", "Sally");
		
		/**
		 * 讀取全局初始化參數.
		 */	
		String company = sc.getInitParameter("company");
		System.out.println("company:" + company);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("username", "Giving");
		
	}

}
