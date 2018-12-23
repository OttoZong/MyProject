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
		 * HttpSession是一個接口,
		 * request.getSession方法會返回一個,
		 * 符合該接口要求的對象(即:session對象).
		 */
		HttpSession session = 
				req.getSession();
		/**
		 * 獲得sessionId,
		 * 注:每一個session對象都有唯一一個session.
		 */
		String sessionId = 
				session.getId();
		System.out.println("sessionId:" + sessionId);
		
		Integer count = (Integer) session.getAttribute("count");
		
		if(count == null){
			//第一次訪問.
			count = 1;			
		}else{
			//不是第一次訪問.
			count++;
		}
		session.setAttribute("count", count);
		res.setContentType("text/hml;charset=utf-8");
		res.getWriter().println("你是第:"+count+"次訪問");
	}
}

	