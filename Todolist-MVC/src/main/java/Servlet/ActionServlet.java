package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

@WebServlet("/list")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ActionServlet() {
		super();

	}

	/**
	 * 將處理好的Dao訊息傳入request.setAttribute 
	 * 轉發list，JSP用EL表達式接值.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionServlet's service()");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// PrintWriter out = response.getWriter();
		
		
		UserDao dao = new UserDao();
		List lists = dao.findName();
		//送值
		request.setAttribute("lists", lists);
		// out.println("lists:"+lists);
		System.out.println("lists:" + lists);
		request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
		// response.getWriter().println("lists:"+lists);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
