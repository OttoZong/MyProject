package com.tedu.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 服務器端配置相關信息.
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
	 * 初始化Servlet的映射.
	 */
	private static void initServletMapping(){
		servletMapping = new HashMap<String,String>();
		servletMapping.put("/myweb/reg", "com.tedu.servlets.RegServlet");
		servletMapping.put("/myweb/login", "com.tedu.servlets.LoginServlet");
	}
	
}
