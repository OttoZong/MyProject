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
 * Http��ĳ�������e�w�q.
 * @author Otto
 *
 */
public class HttpContext {
	public static final int CR = 13;
	public static final int LF = 10;
	/**
	 * �T�����A�N�X�w�q.
	 */
	/**
	 * �N�X:���`.
	 */
	public static final int STATUS_CODE_OK = 200;
	/**
	 * �N�X:�����.
	 */
	public static final int STATUS_CODE_NOT_FOUND = 404;
	/**
	 * �N�X:���~.
	 */
	public static final int STATUS_CODE_ERROR = 500;
	/**
	 * ���A�N�X�P�y�z���M�g
	 */
	private static Map<Integer,String> code_reason_mapping;
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
		//2.��l�ƪ��A�N���P�y�z���M�g
		initCodeReasonMapping();
	}
	private static void initCodeReasonMapping(){
		code_reason_mapping = new HashMap<Integer,String>();
		code_reason_mapping.put(STATUS_CODE_OK, "OK");
		code_reason_mapping.put(STATUS_CODE_ERROR, "ERROR");
		code_reason_mapping.put(STATUS_CODE_NOT_FOUND, "NOT FOUND");
	}
	/**
	 * ��l�Ƥ��������M�g.
	 */
	private static void imitMimeTypeMapping() {
		mimeTypeMapping = new HashMap<String,String>();
		/*
		 * �ѪRconf/web.xml����
		 * �N�Ҧ���<mime-mapping>���ҹϨ��X��.
		 * �N�䤤���l����<extension>�������e,�@��key.
		 * �N�䤤���l����<mime-type>�������e,�@��value.
		 * �s�J��mimeTypeMapping���Y�i.
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
	 * �ھڵ��w�������������������Content-Type����.
	 * @param mime
	 * @return
	 */
	public static String getContentTypeByMine(String mime){
		return mimeTypeMapping.get(mime);
	}
	/**
	 * ������w�����A�N�X�ҹ��������A�y�z.
	 * @param code
	 * @return
	 */
	public static String getReasonByCode(int code){
		return code_reason_mapping.get(code);
	}
	public static void main(String[] args) {
		String contentType = HttpContext.getContentTypeByMine("css");
		System.out.println("contentType="+contentType);
	}
}
