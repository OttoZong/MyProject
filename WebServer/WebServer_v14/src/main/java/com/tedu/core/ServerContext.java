package com.tedu.core;

import java.util.HashMap;
import java.util.Map;

/**
 * �A�Ⱦ��ݰt�m�����H��.
 * @author Otto
 *
 */
public class ServerContext {
	public static Map<String,String> servletMapping;
	
	static{
		init();
	}
	
	private static void init(){
		initServletMapping();
	}
	/**
	 * ��l��Servlet���M�g.
	 */
	private static void initServletMapping(){
		servletMapping = new HashMap<String,String>();
		servletMapping.put("/myweb/reg", "com.tedu.servlets.RegServlet");
		servletMapping.put("/myweb/login", "com.tedu.servlets.LoginServlet");
	}
	
}
