package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import entity.User;

public class ListUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType(
				"text/html;charset=utf-8");	
		PrintWriter out = response.getWriter();
		/*
		 * 使用DAO查詢數據庫,將所有用戶信息查詢出來.
		 */
		UserDAO dao = new UserDAO();
		try {
			List<User> users = dao.findAll();
			/*
			 *	依據查詢到的用戶信息,輸出表格. 
			 */
			out.println("<table width='60%' border='1' "
					+ "cellpadding='0' cellspacing='0'>");
			out.println(
					"<tr><td>ID</td><td>用戶名</td>"
					+ "<td>密碼</td><td>電話</td><td></td></tr>");
			for(int i = 0; i < users.size(); i++){
				User u = users.get(i);
				out.println("<tr><td>" + u.getId() 
				+ "</td><td>" + u.getUsername() 
				+ "</td><td>" + u.getPwd() 
				+ "</td><td>" + u.getPhone() 
				+ "</td><td><a href='del?id=" + u.getId() + "'>刪除</a></td></tr>");
			}
			out.println("</table>");
			out.println(
					"<a href='addUser.html'>" 
					+ "添加用戶</a>");

		} catch (Exception e) {
			e.printStackTrace();
			out.println("系統繁忙,稍後重試");
		}
		
	}
}
