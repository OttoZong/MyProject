package com.tedu.http;

import java.io.InputStream;
import java.util.Arrays;

/**
 * 該類的每一個實例用於表是客戶端發送過來的一次HTTP請求內容.
 * 
 * 這裡包含:請求行信息,消息頭,消息正文
 * 
 * @author Otto
 *
 */
public class HttpRequest {
	/*
	 * 請求行中的內容
	 */
	// 請求的方法
	private String method;
	// 請求的資源路徑
	private String uri;
	// 請求使用的HTTP協議版本
	private String protocol;

	/**
	 * 構造方法,通過給定的輸入流讀取客戶端發送過來的HTTP請求內容.
	 */
	public HttpRequest(InputStream in) {
		/*
		 * 解析分為三步. 1.解析請求行. 2.解析消息頭. 3.解析消息正文.
		 */
		parseRquestLine(in);
	}

	/**
	 * 解析請求行
	 */
	private void parseRquestLine(InputStream in) {
		/*
		 * 解析請求行的大致步驟: 1.通過輸入流讀取一行字符串. 以CRLF結尾. CR:回車,ASC編碼對應為13. LF:換行,ASC編碼對應為10.
		 * 2.將讀取的請求行內容按照空格拆分. 3.將拆除來的三個部分,分別對應的設置到屬性method,uri,protocol上.
		 * 
		 * localhost:8080/index.html.
		 */
		try {
			StringBuilder builder = new StringBuilder();
			int d = -1;
			char c1 = 0, c2 = 0; // c1表示上次讀到的字節
			while ((d = in.read()) != -1) {
				c2 = (char) d;
				if (c1 == 13 && c2 == 10) {
					break;
				}
				builder.append(c2);
				c1 = c2;
			}
			String line = builder.toString().trim();
			
			String[] data = line.split("\\s");
			System.out.println("data:"+data[0]);
			System.out.println(data.length);
			System.out.println(Arrays.toString(data));
			
			this.method = data[0];
			this.uri = data[1];
			this.protocol = data[2];
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getMethod() {
		return method;
	}

	public String getUri() {
		return uri;
	}

	public String getProtocl() {
		return protocol;
	}

}
