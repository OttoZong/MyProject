package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import entity.User;

public class AddUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType(
				"text/html;charset=utf-8");
		PrintWriter out =
				response.getWriter();
		
		/*
		 * 讀取用戶信息
		 */
		String username = 
				request.getParameter("uname");
		String pwd = 
				request.getParameter("pwd");
		String phone = 
				request.getParameter("phone");
		
		System.out.println("username:" 
				+ username + " pwd:" 
				+ pwd + " phone:" + phone);
		
		/*
		 * 服務器端應該對用戶提交的數據進行合法性檢查,
		 * 比如,檢查用戶名是否為空等,此處暫時不考慮.
		 */
		
		/*
		 * 使用DAO將用戶信息插入到數據庫.
		 */
		UserDAO dao = new UserDAO();
		
		User user = new User();
		user.setUsername(username);
		user.setPwd(pwd);
		user.setPhone(phone);
		try {
			dao.save(user);
			out.println("添加成功<br/>");
			//重定向到用戶列表
			
			response.sendRedirect("list");
			System.out.println("重定向之後的代碼");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("系統繁忙,稍後重試");
		}	
	}
}