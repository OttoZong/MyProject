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
		 * �q�L�~�Ӧ�GenericServlet����k����o,
		 * ServletConfig��H.
		 */
		ServletConfig config = getServletConfig();
		/*
		 * Ū����l�ưѼ�.
		 */
		String company = config.getInitParameter("company");
		System.out.println("���q:"+ company);
	}
}
