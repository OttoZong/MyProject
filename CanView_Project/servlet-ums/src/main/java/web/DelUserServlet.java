package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

public class DelUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//讀取要刪除的員工的id
		String id =
				request.getParameter("id");
		//調用DAO提供的方法,刪除數據庫中的對應的員工紀錄
		UserDAO dao = new UserDAO();
		try {
			dao.delete(Integer.parseInt(id));
			//重定向到用戶列表
			response.sendRedirect("list");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("系統繁忙,稍後重試");
		}
	}
}
