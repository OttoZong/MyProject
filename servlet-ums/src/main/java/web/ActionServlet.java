package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import entity.User;

public class ActionServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		
		System.out.println("actionServlet's service()");
		String uri = request.getRequestURI();
		String action = 
				uri.substring(
						uri.lastIndexOf("/"),
						uri.lastIndexOf("."));
		System.out.println("action:" + action);
		
		request.setCharacterEncoding("utf-8");
		response.setContentType(
				"text/html;charset=utf-8");	
		PrintWriter out = response.getWriter();	
		
		if("/list".equals(action)){
			/*
			 * 使用DAO查詢數據庫,將所有用戶信息查詢出來.
			 */
			UserDAO dao = new UserDAO();
			try {
				List<User> users = dao.findAll();
				/*
				 *	依據查詢到的用戶信息,輸出表格. 
				 */
				//step1.綁定數據到request對象上.
				request.setAttribute("users", users);
				//step2.獲得轉發器
				RequestDispatcher rd = 
						request.getRequestDispatcher(
								"listUsers.jsp");
				//step3.轉發
				rd.forward(request,response);
				
			} catch (Exception e) {
				e.printStackTrace();
				out.println("系統繁忙,稍後重試");
			}
		}else if("/add".equals(action)){		
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
				response.sendRedirect("list.do");
				System.out.println("重定向之後的代碼");
			} catch (Exception e) {
				e.printStackTrace();
				out.println("系統繁忙,稍後重試");
			}	
		}else if("/del".equals(action)){
			//讀取要刪除的員工的id
			String id =
					request.getParameter("id");
			//調用DAO提供的方法,刪除數據庫中的對應的員工紀錄
			UserDAO dao = new UserDAO();
			try {
				dao.delete(Integer.parseInt(id));
				//重定向到用戶列表
				response.sendRedirect("list.do");
			} catch (Exception e) {
				e.printStackTrace();
				out.println("系統繁忙,稍後重試");
			}
		}else if("/login".equals(action)){
			//讀取用戶名和密碼.
			String username = request.getParameter("uname");
			String pwd = request.getParameter("pwd");
			System.out.println("username:" + username + "pwd:"+ pwd);
			//使用dao查詢數據庫,看是否有符合條件的紀錄.
			UserDAO dao = new UserDAO();
			try {
				User user = dao.find(username);
				if(user != null && user.getPwd().equals(pwd)){
					//登入成功,跳轉用戶列表.
					response.sendRedirect("list.do");
				}else{
					//登入失敗,提示用戶.
					request.setAttribute("login_failed","用戶名或密碼錯誤");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				out.println("系統繁忙,稍後重試");
			}
			
		}
		
	}
}
