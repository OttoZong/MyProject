package web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 用於統計在線人數的監聽器:
 * 思路:
 * 	監聽session的創建和銷毀.
 * @author Otto
 *
 */
public class CountListener implements HttpSessionListener{
	
	/**
	 * session對象創建之後執行.
	 */
	public void sessionCreated(
			HttpSessionEvent arg0) {
		System.out.println("sessionCreated()");
		HttpSession session = arg0.getSession();
		
		ServletContext sc = session.getServletContext();
		
		Integer count = (Integer)sc.getAttribute("count");
		
		if(count == null){
			//第一個用戶.
			count = 1;
		}else{
			//不是第一個用戶,則人數加1.
			count ++;
		}
		sc.setAttribute("count", count);
	}
	
	/**
	 * session對象銷毀之後執行.
	 */
	public void sessionDestroyed(
			HttpSessionEvent arg0) {
		System.out.println("sessionDestroyed()");
		HttpSession session = arg0.getSession();
		ServletContext sc = session.getServletContext();
		Integer count =(Integer)sc.getAttribute("count");
		count --;
		
		sc.setAttribute("count", count);
		
		
	}
	
}
