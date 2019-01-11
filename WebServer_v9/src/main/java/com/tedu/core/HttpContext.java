package com.tedu.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Http��ĳ�������e�w�q.
 * @author Otto
 *
 */
public class HttpContext {
	public static final int CR = 13;
	public static final int LF = 10;
	
	/**
	 * ���������M�g.
	 * key:��������.
	 * value:Content-Type��������������.
	 */
	private static Map<String,String> mimeTypeMapping;
	
	static{
		//HttpContext�[�����ɭԶ}�l��l��.
		init();
	}
	
	/**
	 * ��l��HttpContext�������e
	 */
	public static void init(){
		//1.��l�Ƥ��������M�g.
		imitMimeTypeMapping();
	}
	
	/**
	 * ��l�Ƥ��������M�g.
	 */
	private static void imitMimeTypeMapping() {
		mimeTypeMapping = new HashMap<String,String>();
		mimeTypeMapping.put("html", "text/html");
		mimeTypeMapping.put("jpg", "text/jpg");
		mimeTypeMapping.put("gif", "text/gif");
		mimeTypeMapping.put("png", "text/png");
	}
	
	/**
	 * �ھڵ��w�������������������Content-Type����.
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
