package com.tedu.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

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
		/*
		 * 解析conf/web.xml文檔
		 * 將所有的<mime-mapping>標籤圖取出來.
		 * 將其中的子標籤<extension>中的內容,作為key.
		 * 將其中的子標籤<mime-type>中的內容,作為value.
		 * 存入到mimeTypeMapping中即可.
		 */
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new FileInputStream("conf"+File.separator+"web.xml"));
			
			Element root = doc.getRootElement();
			List<Element> list = root.elements("mime-mapping");
			for(Element ele : list){
				String key = ele.elementText("extension");
				String value = ele.elementText("mime-type");
				mimeTypeMapping.put(key, value);
			}
			System.out.println("mimeTypeMapping.size()="+mimeTypeMapping.size());
			
		} catch (Exception e) {
			
		}
		
//		mimeTypeMapping.put("html", "text/html");
//		mimeTypeMapping.put("jpg", "text/jpg");
//		mimeTypeMapping.put("gif", "text/gif");
//		mimeTypeMapping.put("png", "text/png");
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
		String contentType = HttpContext.getContentTypeByMine("css");
		System.out.println("contentType="+contentType);
	}
}
