package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		User u = new User();
//		UserDao dao = new UserDao();
//		try {
//			List<User> lists = dao.findName();
//			
//			request.setAttribute("list", list);
//			RequestDispatcher rd = 
//					request.getRequestDispatcher(
//							"WEB-INF/list.jsp");
//			
//			rd.forward(request,response);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
////			System.out.println();out.println("系統繁忙,稍後重試");
//		}
//		
//		response.getWriter().println(lists);
	}
	

}
