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
		 * Ū���Τ�H��
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
		 * �A�Ⱦ������ӹ�Τᴣ�檺�ƾڶi��X�k���ˬd,
		 * ��p,�ˬd�Τ�W�O�_���ŵ�,���B�Ȯɤ��Ҽ{.
		 */
		
		/*
		 * �ϥ�DAO�N�Τ�H�����J��ƾڮw.
		 */
		UserDAO dao = new UserDAO();
		
		User user = new User();
		user.setUsername(username);
		user.setPwd(pwd);
		user.setPhone(phone);
		try {
			dao.save(user);
			out.println("�K�[���\<br/>");
			//���w�V��Τ�C��
			
			response.sendRedirect("list");
			System.out.println("���w�V���᪺�N�X");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("�t���c��,�y�᭫��");
		}	
	}
}
