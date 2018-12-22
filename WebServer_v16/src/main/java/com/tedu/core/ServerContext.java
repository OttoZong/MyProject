package com.tedu.core;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 服務器端配置相關信息.
 * @author Otto
 *
 */
public class ServerContext {
	public static String URIEncoding;
	public static int port;
	public static String protocol;
	public static int threadPool;
	public static Map<String,String> servletMapping;
	
	static{
		init();
	}
	
	private static void init(){
		initServletMapping();
		initServerInfo();
	}
	
	/**
	 * 加載conf/server.xml文件,初始化相關信息.
	 */
	private static void initServerInfo(){
		
	}
	/**
	 * 初始化Servlet的映射.
	 */
	private static void initServletMapping(){
		servletMapping = new HashMap<String,String>();
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new FileInputStream("ServletMapping.xml"));
			Element root = doc.getRootElement();
			List<Element> list = root.elements();
			for(Element mapping : list){
				String uri = mapping.attributeValue("uri");
				String className = mapping.attributeValue("className");
				servletMapping.put(uri, className);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		servletMapping.put("/myweb/reg", "com.tedu.servlets.RegServlet");
		servletMapping.put("/myweb/login", "com.tedu.servlets.LoginServlet");
	}
	
}
