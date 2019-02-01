package tw.ottozong.el;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.ottozong.bean.Person;

@WebServlet("/servlet_el")
public class Servlet_El extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet_El() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		List<Person> persons = Arrays.asList(new Person("Otto", 23, "Taipei"));

		// String name = "Otto";
		// request.setAttribute("label", name);

		System.out.println("persons" + persons);
		request.setAttribute("persons", persons);

		// 頁面為el.jsp
		RequestDispatcher rd = request.getRequestDispatcher("el.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
