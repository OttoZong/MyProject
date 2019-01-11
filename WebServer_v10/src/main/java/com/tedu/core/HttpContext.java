package com.tedu.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Http協議相關內容定義.
 * @author Otto
 *
 */
public class HttpContext {
	public static final int CR = 13;
	public static final int LF = 10;
	
	/**
	 * 介質類型映射.
	 * key:介質類型.
	 * value:Content-Type對應該類型的值.
	 */
	private static Map<String,String> mimeTypeMapping;
	
	static{
		//HttpContext加載的時候開始初始化.
		init();
	}
	
	/**
	 * 初始化HttpContext相關內容
	 */
	public static void init(){
		//1.初始化介質類型映射.
		imitMimeTypeMapping();
	}
	
	/**
	 * 初始化介質類型映射.
	 */
	private static void imitMimeTypeMapping() {
		mimeTypeMapping = new HashMap<String,String>();
		mimeTypeMapping.put("html", "text/html");
		mimeTypeMapping.put("jpg", "text/jpg");
		mimeTypeMapping.put("gif", "text/gif");
		mimeTypeMapping.put("png", "text/png");
	}
	
	/**
	 * 根據給定的介質類型獲取對應的Content-Type的值.
	 * @param mime
	 * @return
	 */
	public static String getContentTypeByMine(String mime){
		return mimeTypeMapping.get(mime);
	}
	public static void main(String[] args) {
		System.out.println("1");
		String contentType = HttpContext.getContentTypeByMine("png");
		System.out.println("2");
		System.out.println(contentType);
		System.out.println("3");
	}
}
