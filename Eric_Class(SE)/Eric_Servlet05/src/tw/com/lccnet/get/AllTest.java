package tw.com.lccnet.get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AllTest")
public class AllTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AllTest() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		String username=request.getParameter("username");
		
		String city=request.getParameter("city");
		System.out.println(city);
		
			String[] like=request.getParameterValues("like");
			for(int i=0;like !=null && i<like.length;i++){
				System.out.println(like[i]);
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
