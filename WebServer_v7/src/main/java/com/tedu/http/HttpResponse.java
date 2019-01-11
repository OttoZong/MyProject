package com.tedu.http;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/**
 * 是一個Http響應
 * 
 * @author Otto
 *
 */
public class HttpResponse {
	/*
	 * 用於向客戶端做響應的輸出流. 它應該是ClientHanlder通過Socket獲取的輸出流.
	 */
	private OutputStream out;
	/*
	 * 一個要響應給客戶端的文件資源 這個文件的數據最終會在響應正文中以字節的形式發送給客戶端.
	 */
	private File entity;

	// 建構子
	public HttpResponse(OutputStream out) {
		this.out = out;
	}

	/**
	 * 將該響應對象中的內容響應給客戶端.
	 */
	public void fiush() {
		/**
		 * 發送給客戶端的Http響應分為三步: 1.發送狀態行信息 2.發送響應頭信息 3.發送響應正文信息
		 */
		sendStatusLine();
		sendHeaders();
		sendContent();
	}

	/**
	 * 發送狀態行信息
	 */
	private void sendStatusLine() {
		String line = "HTTP/1.1 200 OK";
		println(line);

	}

	/**
	 * 發送響應頭信息
	 */
	private void sendHeaders() {
		println("Content-Type:"+getMimeTypeByEntity());
		println("Content-Length:" + entity.length());
		println(""); // 單獨發送CRLF表示頭發送完畢.
	}

	/**
	 * 發送響應正文信息
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
	 * 向客戶端發送一行字符串該字符串會通過ISO8859-1轉換為一組字節並寫出.
	 *  
	 * 寫出後會自動連續寫出CRLF.
	 * @param line
	 */
	private void println(String line) {
		try {
			out.write(line.getBytes("ISO8859-1"));
			out.write(13);
			out.write(10);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 根據實體文件的名子獲取對應的介質類型. Content-Type使用的值.
	 * 
	 * 臨時先將該方法寫在response中. 
	 * 實際上Content-Type的值應當是在設置response內容的時候一同設置.
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
