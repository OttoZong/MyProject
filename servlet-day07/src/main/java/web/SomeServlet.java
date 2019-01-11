package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void service(
			HttpServletRequest req, 
			HttpServletResponse res) 
					throws ServletException, 
					IOException {
		/**
		 * HttpSession�O�@�ӱ��f,
		 * request.getSession��k�|��^�@��,
		 * �ŦX�ӱ��f�n�D����H(�Y:session��H).
		 */
		HttpSession session = 
				req.getSession();
		/**
		 * ��osessionId,
		 * �`:�C�@��session��H�����ߤ@�@��session.
		 */
		String sessionId = 
				session.getId();
		System.out.println("sessionId:" + sessionId);
		
		Integer count = (Integer) session.getAttribute("count");
		
		if(count == null){
			//�Ĥ@���X��.
			count = 1;			
		}else{
			//���O�Ĥ@���X��.
			count++;
		}
		session.setAttribute("count", count);
		res.setContentType("text/hml;charset=utf-8");
		res.getWriter().println("�A�O��:"+count+"���X��");
	}
}

	