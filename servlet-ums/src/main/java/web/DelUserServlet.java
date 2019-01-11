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
		
		//Ū���n�R�������u��id
		String id =
				request.getParameter("id");
		//�ե�DAO���Ѫ���k,�R���ƾڮw�������������u����
		UserDAO dao = new UserDAO();
		try {
			dao.delete(Integer.parseInt(id));
			//���w�V��Τ�C��
			response.sendRedirect("list");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("�t���c��,�y�᭫��");
		}
	}
}
