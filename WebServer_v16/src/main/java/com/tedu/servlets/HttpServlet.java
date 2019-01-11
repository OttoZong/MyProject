package com.tedu.servlets;

import java.io.File;

import com.tedu.core.HttpContext;
import com.tedu.http.HttpRequest;
import com.tedu.http.HttpResponse;

/**
 * �Ҧ�Servlet���W��.�w�qServlet�������ƪ��\��.
 * @author Otto
 *
 */
public abstract class HttpServlet {
	public abstract void service(HttpRequest request,HttpResponse response);
	
	/**
	 * ���୶��
	 */
	protected void forward(String path,HttpRequest request,HttpResponse response){
		try {
			File file = new File("webapps"+path);
			String name = file.getName().substring(file.getName().lastIndexOf(".")+1);
			//�ھګ��]��������Content-Type��.
			String contentType = HttpContext.getContentTypeByMine(name);

			//�]�m�T���YContent-Type
			response.setContentType(contentType);
			response.setContentLength((int)file.length());
			
			//�]�m�T������.
			response.setEntity(file);
			//�T���Ȥ��.
			response.fiush();
		} catch (Exception e) {
			
		}
	}
}
