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
			 * �ϥ�DAO�d�߼ƾڮw,�N�Ҧ��Τ�H���d�ߥX��.
			 */
			UserDAO dao = new UserDAO();
			try {
				List<User> users = dao.findAll();
				/*
				 *	�̾ڬd�ߨ쪺�Τ�H��,��X���. 
				 */
				//step1.�j�w�ƾڨ�request��H�W.
				request.setAttribute("users", users);
				//step2.��o��o��
				RequestDispatcher rd = 
						request.getRequestDispatcher(
								"listUsers.jsp");
				//step3.��o
				rd.forward(request,response);
				
			} catch (Exception e) {
				e.printStackTrace();
				out.println("�t���c��,�y�᭫��");
			}
		}else if("/add".equals(action)){		
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
				response.sendRedirect("list.do");
				System.out.println("���w�V���᪺�N�X");
			} catch (Exception e) {
				e.printStackTrace();
				out.println("�t���c��,�y�᭫��");
			}	
		}else if("/del".equals(action)){
			//Ū���n�R�������u��id
			String id =
					request.getParameter("id");
			//�ե�DAO���Ѫ���k,�R���ƾڮw�������������u����
			UserDAO dao = new UserDAO();
			try {
				dao.delete(Integer.parseInt(id));
				//���w�V��Τ�C��
				response.sendRedirect("list.do");
			} catch (Exception e) {
				e.printStackTrace();
				out.println("�t���c��,�y�᭫��");
			}
		}else if("/login".equals(action)){
			//Ū���Τ�W�M�K�X.
			String username = request.getParameter("uname");
			String pwd = request.getParameter("pwd");
			System.out.println("username:" + username + "pwd:"+ pwd);
			//�ϥ�dao�d�߼ƾڮw,�ݬO�_���ŦX���󪺬���.
			UserDAO dao = new UserDAO();
			try {
				User user = dao.find(username);
				if(user != null && user.getPwd().equals(pwd)){
					//�n�J���\,����Τ�C��.
					response.sendRedirect("list.do");
				}else{
					//�n�J����,���ܥΤ�.
					request.setAttribute("login_failed","�Τ�W�αK�X���~");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				out.println("�t���c��,�y�᭫��");
			}
			
		}
		
	}
}
