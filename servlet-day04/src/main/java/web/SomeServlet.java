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
		
		System.out.println("service()");
		//先获得请求资源路径
		String uri = request.getRequestURI();
		System.out.println("uri:" + uri);
		//截取请求资源路径的一部分，方便比较
		String action = 
			uri.substring(uri.lastIndexOf("/"),
					uri.lastIndexOf("."));
		System.out.println("action:" + action);
		if("/list".equals(action)){
			System.out.println("处理用户列表请求...");
		}else if("/add".equals(action)){
			System.out.println("处理添加用户请求...");
		}
	}
}




