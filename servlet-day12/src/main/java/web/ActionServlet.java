package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BmiService;
/**
 * 控制器
 * 		控制器主要負責兩件事:
 * 1.依據請求路徑調用對應的模型來處理.
 * 2.依據模型返回的結果，調用對應的視圖來呈現.
 */

public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		String uri = 
				request.getRequestURI();
		String action =
			uri.substring(uri.lastIndexOf("/"),
					uri.lastIndexOf("."));
		System.out.println("action:" + action);
		
		
		//1.依據請求路徑調用對應的模型來處理.
		if("/toBmi".equals(action)){
			
			request.getRequestDispatcher("/WEB-INF/bmi_form.jsp")
			.forward(request, response);
			
		}else if("/bmi".equals(action)){
			String height = 
					request.getParameter("height");
			String weight = 
					request.getParameter("weight");
			
			BmiService bService = 
					new BmiService();
			
			String status = bService.bmi(
					Double.parseDouble(height),
					Double.parseDouble(weight));
			//2.依據模型返回的處理結果,調用對應的視圖來呈現.
			request.setAttribute("status", status);
			request.getRequestDispatcher(
					"/WEB-INF/view.jsp")
			.forward(request, response);
			
			
		}
	}

}
