package com.tedu.http;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.tedu.core.HttpContext;

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
	/*
	 * 消息頭
	 */
	private Map<String,String> headers = new HashMap<String,String>();

	/**
	 * 構造方法,通過給定的輸入流讀取客戶端發送過來的HTTP請求內容.
	 */
	public HttpRequest(InputStream in) {
		/*
		 * 解析分為三步. 
		 * 1.解析請求行. 
		 * 2.解析消息頭. 
		 * 3.解析消息正文.
		 */
		parseRquestLine(in);
		parseHeaders(in);
	}
	/**
	 * 解析消息頭
	 */
	private void parseHeaders(InputStream in){
		/*
		 * 由於之前的方法已經從流中將請求行讀取了,
		 * 所以從這個流中繼續讀取的就應是消息頭內容了.
		 * 
		 * 讀取若干行內容(CRLF結尾算一行)
		 * 每一行按照":"拆成兩部分,
		 * 第一部分應當是消息頭的名子,
		 * 第二部分為對應的值,將名子作為key,
		 * 值作為value存入到header,這個Map中保留.
		 */
		// v9
		while(true){
			String line = readLine(in);
			//單獨讀取到CRLF.
			if("".equals(line)){
				break;
			}
			//找到每條頭信息中":"的位置.
			int index = line.indexOf(":");
			String name = line.substring(0, index).trim();
			String value = line.substring(index+1).trim();
			this.headers.put(name, value);
		}
	}

	/**
	 * 解析請求行
	 */
	private void parseRquestLine(InputStream in) {
		/*
		 * 解析請求行的大致步驟: 
		 * 1.通過輸入流讀取一行字符串. 以CRLF結尾. 
		 * CR:回車,ASC編碼對應為13. 
		 * LF:換行,ASC編碼對應為10.
		 * 2.將讀取的請求行內容按照空格拆分. 
		 * 3.將拆除來的三個部分,分別對應的設置到屬性method,uri,protocol上.
		 * 
		 * localhost:8080/index.html.
		 */
		try {
			String line = readLine(in);
			String[] data = line.split("\\s");
			System.out.println(data.length);
			System.out.println(Arrays.toString(data));
			
			this.method = data[0];
			this.uri = data[1];
//			parseUri();
			this.protocol = data[2];
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private String readLine(InputStream in){
		StringBuilder builder = new StringBuilder();
		try {
			int d = -1;
			char c1=0,c2=0;//c1表示上次讀到的字節,c2表示本讀到的字節
			while((d = in.read())!=-1){
				c2 = (char)d;
				if(c1==HttpContext.CR&&
				   c2==HttpContext.LF){
					break;
				}
				builder.append(c2);
				c1 = c2;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return builder.toString().trim();
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
