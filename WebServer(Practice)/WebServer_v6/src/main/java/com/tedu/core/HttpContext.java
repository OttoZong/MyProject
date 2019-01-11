package com.tedu.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Http协议相关内容定义
 * @author adminitartor
 *
 */
public class HttpContext {
	public static final int CR = 13;
	public static final int LF = 10;
	
	/**
	 * 介质类型映射
	 * key:介质类型
	 * value:Content-Type对应该类型的值
	 */
	private static Map<String,String> mimeTypeMapping;
	
	static{
		//HttpContext加载的时候开始初始化
		init();
	}
	
	/**
	 * 初始化HttpContext相关内容
	 */
	public static void init(){
		//1 初始化介质类型映射
		initMimeTypeMapping();
	}
	/**
	 * 初始化介质类型映射
	 */
	private static void initMimeTypeMapping(){
		mimeTypeMapping = new HashMap<String,String>();
		mimeTypeMapping.put("html", "text/html");
		mimeTypeMapping.put("jpg", "image/jpg");
		mimeTypeMapping.put("gif", "image/gif");
		mimeTypeMapping.put("png", "image/png");
	}
	/**
	 * 根据给定的介质类型获取对应的Content-Type的值
	 * 
	 * @param mime
	 * @return
	 */
	public static String getContentTypeByMime(String mime){
		return mimeTypeMapping.get(mime);
	}
	
	public static void main(String[] args) {
		String contentType =
			HttpContext.getContentTypeByMime("png");
		System.out.println(contentType);
	}
}






