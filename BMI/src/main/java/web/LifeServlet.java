package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet{

	public LifeServlet() {
		System.out.println("LifeServlet's constructor");		
	}
	
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("LifeServlet's init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("LifeServlet's destroy()");
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		System.out.println("LifeServlet's doGet()");
		
		/*
		 * 通過繼承自GenericServlet的方法來獲得,
		 * ServletConfig對象.
		 */
		ServletConfig config = getServletConfig();
		/*
		 * 讀取初始化參數.
		 */
		String company = config.getInitParameter("company");
		System.out.println("公司:"+ company);
	}
}
