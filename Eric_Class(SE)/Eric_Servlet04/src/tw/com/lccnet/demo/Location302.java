package tw.com.lccnet.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class location302
 */
@WebServlet(name = "Location302", urlPatterns = { "/location302" })
public class Location302 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message="123 ...";
		
//		response.setHeader("refresh","3");
		response.setHeader("refresh","3,http://www.yahoo.com.tw");
		
		response.getOutputStream().write(message.getBytes());
				
				
		response.setStatus(302);
		response.setHeader("location", "index.html");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
