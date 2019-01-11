package com.tedu.servlets;

import java.io.File;

import com.tedu.core.HttpContext;
import com.tedu.http.HttpRequest;
import com.tedu.http.HttpResponse;

/**
 * 所有Servlet的超類.定義Servlet都應當具備的功能.
 * @author Otto
 *
 */
public abstract class HttpServlet {
	public abstract void service(HttpRequest request,HttpResponse response);
	
	/**
	 * 跳轉頁面
	 */
	protected void forward(String path,HttpRequest request,HttpResponse response){
		try {
			File file = new File("webapps"+path);
			String name = file.getName().substring(file.getName().lastIndexOf(".")+1);
			//根據後餟找到對應的Content-Type值.
			String contentType = HttpContext.getContentTypeByMine(name);

			//設置響應頭Content-Type
			response.setContentType(contentType);
			response.setContentLength((int)file.length());
			
			//設置響應正文.
			response.setEntity(file);
			//響應客戶端.
			response.fiush();
		} catch (Exception e) {
			
		}
	}
}
