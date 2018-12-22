package tw.com.lccnet.get;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajaxconnection")
public class AjaxConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AjaxConnection() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		String fillname=request.getParameter("fillname");
		PrintWriter out=response.getWriter();
		out.println(" "+fillname);
		System.err.println(fillname);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
