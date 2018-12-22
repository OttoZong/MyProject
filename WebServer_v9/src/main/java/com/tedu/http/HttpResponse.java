package com.tedu.http;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.tedu.core.HttpContext;

/**
 * �O�@��Http�T��
 * 
 * @author Otto
 *
 */
public class HttpResponse {
	/*
	 * �Ω�V�Ȥ�ݰ��T������X�y. �����ӬOClientHanlder�q�LSocket�������X�y.
	 */
	private OutputStream out;
	/*
	 * �@�ӭn�T�����Ȥ�ݪ����귽,�o�Ӥ�󪺼ƾڳ̲׷|�b�T�����夤�H�r�`���Φ��o�e���Ȥ��.
	 */
	private File entity;
	/**
	 * ��e�T�����]�t���Ҧ��T���Y���H��
	 * key:�T���Y���W�l
	 * value:�T���Y��������
	 * �Ҧp:
	 * key:Content-Type
	 * value:text/html
	 */
	private Map<String,String> headers = new HashMap<String,String>();
	
	
	// �غc�l
	public HttpResponse(OutputStream out) {
		this.out = out;
	}

	/**
	 * �N���T����H�������e�T�����Ȥ��.
	 */
	public void fiush() {
		/**
		 * �o�e���Ȥ�ݪ�Http�T�������T�B: 1.�o�e���A��H�� 2.�o�e�T���Y�H�� 3.�o�e�T������H��
		 */
		sendStatusLine();
		sendHeaders();
		sendContent();
	}

	/**
	 * �o�e���A��H��
	 */
	private void sendStatusLine() {
		String line = "HTTP/1.1 200 OK";
		println(line);

	}

	/**
	 * �o�e�T���Y�H��
	 */
	private void sendHeaders() {
		System.out.println("�ǳƵo�e�T���Y�H��...");
		Set<Entry<String,String>> headerSet = headers.entrySet();
		for(Entry<String,String> header : headerSet){
			String line = header.getKey()+":"+header.getValue();
			System.out.println("Line:"+line);
			
			println(line);//�o�e�C�@���Y�H��.
		}
		println(""); // ��W�o�eCRLF����Y�o�e����.
	}

	/**
	 * �o�e�T������H��.
	 */
	private void sendContent() {
		/**
		 * BufferedInputStream bis = null; try { bis = new
		 * BufferedInputStream(new FileInputStream(entity)); int d = -1;
		 * while((d = bis.read())!=-1){ out.write(d); }
		 */
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(entity);

			int len = -1;
			byte[] data = new byte[1024 * 10];

			while ((len = fis.read(data)) != -1) {
				out.write(data, 0, len);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * �V�Ȥ�ݵo�e�@��r�Ŧ�Ӧr�Ŧ�|�q�LISO8859-1�ഫ���@�զr�`�üg�X.
	 *  
	 * �g�X��|�۰ʳs��g�XCRLF.
	 * @param line
	 */
	private void println(String line) {
		try {
			out.write(line.getBytes("ISO8859-1"));
			out.write(HttpContext.CR);
			out.write(HttpContext.LF);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * �ھڹ����󪺦W�l�����������������. Content-Type�ϥΪ���.
	 * 
	 * �{�ɥ��N�Ӥ�k�g�bresponse��. 
	 * ��ڤWContent-Type��������O�b�]�mresponse���e���ɭԤ@�P�]�m.
	 * 
	 * @return
	 */
	private String getMimeTypeByEntity() {
		// private static String getMimeTypeByEntity(String filename){
		/*
		 * html text/html jpg image/jpg png image/png gif image/gif
		 * 
		 * filename:logo.png
		 */

		String name = entity.getName().substring(entity.getName().lastIndexOf(".") + 1);
		if ("html".equals(name)) {
			return "text/html";
		} else if ("jpg".equals(name)) {
			return "image/jpg";
		} else if ("png".equals(name)) {
			return "image/png";
		} else if ("gif".equals(name)) {
			return "image/gif";
		}
		return "";
	}
	/**
	 * �]�m�Y�H��Content-Type��������.
	 * @param contentType
	 */
	public void setContentType(String contentType){
		this.headers.put("Content-Type", contentType);
	}
	/**
	 * �]�m�Y�H��Content-length
	 * @param length
	 */
	public void setContentLength(int length){
		this.headers.put("Content-Length", length+"");
	}

	public File getEntity() {
		return entity;
	}

	public void setEntity(File entity) {
		this.entity = entity;
	}

	public static void main(String[] args) {
//		String str = getMimeTypeByEntity("logo.png");
//		System.out.println(str); // image/png
		
	}

}
