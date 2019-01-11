package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BmiServlet extends HttpServlet{

	@Override
	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,
					IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		//讀取身高體重
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		//計算bmi指數
		double bmi = 
				Double.parseDouble(weight)/
				Double.parseDouble(height)/	
				Double.parseDouble(height);
		
		
		//讀取數值範圍.
		ServletConfig config = getServletConfig();
		String min = config.getInitParameter("min");
		String max = config.getInitParameter("max");
		

		//依照bmi指數,判斷體質狀況.
		String status = "正常";
		if(bmi<Integer.parseInt(min)){
			status = "過輕";
		}
		if(bmi<Integer.parseInt(min)){
			status = "過重";
		}
		//輸出
		response.getWriter().println(
				"你的bmi指數是:"+ bmi + 
				" 體質狀況是:" + status );
	}
	
}
