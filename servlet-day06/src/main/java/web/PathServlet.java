package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PathServlet
 */
public class PathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,
					IOException {
		String username = 
				request.getParameter("uname");
		System.out.println("uname:" + username);
		
		//重定向地址.
//		response.sendRedirect(
//				request.getContextPath() +
//				"/biz01/b1.jsp");
		//鏈式風格
		request.getRequestDispatcher("/biz03/sub/b4.jsp")
		.forward(request, response);
		
	}

}
