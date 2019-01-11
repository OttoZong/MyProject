package web;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.UserDAO;
import entity.User;

/**
 * 監聽Servlet上下文的創建和銷毀.
 * @author Otto
 *
 */
public class SomeListener implements ServletContextListener{
	/**
	 * Servlet上下文被銷毀後執行.
	 */
	public void contextDestroyed(
			ServletContextEvent arg0) {
		System.out.println("contextDestroyed()");
		
	}
	/**
	 * Servlet上下文創建好後執行.
	 */
	public void contextInitialized(
			ServletContextEvent arg0) {
		System.out.println("contextInitalized()");
		//使用DAO查詢數據庫,將用戶信息綁定到servlet上下文.
		List<User> user = new UserDAO().findAll();
		arg0.getServletContext().setAttribute("user", user);
		
	}

}
