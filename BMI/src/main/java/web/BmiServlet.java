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
		
		//Ū�������魫
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		//�p��bmi����
		double bmi = 
				Double.parseDouble(weight)/
				Double.parseDouble(height)/	
				Double.parseDouble(height);
		
		
		//Ū���ƭȽd��.
		ServletConfig config = getServletConfig();
		String min = config.getInitParameter("min");
		String max = config.getInitParameter("max");
		

		//�̷�bmi����,�P�_��説�p.
		String status = "���`";
		if(bmi<Integer.parseInt(min)){
			status = "�L��";
		}
		if(bmi<Integer.parseInt(min)){
			status = "�L��";
		}
		//��X
		response.getWriter().println(
				"�A��bmi���ƬO:"+ bmi + 
				" ��説�p�O:" + status );
	}
	
}
