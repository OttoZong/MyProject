package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException,IOException{
				request.setCharacterEncoding("utf-8");
				String name = 
						request.getParameter("name");
				System.out.println("name:" + name);
				
				String[] interest =
						request.getParameterValues(
								"interest");
				
				//在interest不為空的情況下,依序存取interest.
				if(interest != null){
					for(int i = 0;i< interest.length;i++){
						System.out.println(interest[i]);
					}
				}
			}	
}
