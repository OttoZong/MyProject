package com.tedu.servlets;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import com.tedu.http.HttpRequest;
import com.tedu.http.HttpResponse;

/**
 * 處理註冊業務
 * @author Otto
 *
 */
public class RegServlet extends HttpServlet{
	
	private HttpResponse response;

	public void service(HttpRequest request,HttpResponse respomse){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		System.out.println(username+","+password+","+nickname);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream("user.txt",true)
				)
			);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
		System.out.println("註冊完畢!");
		forward("/myweb/reg_success.html", request, response);
	}
}
