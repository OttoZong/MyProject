package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommentFilter2 implements Filter{

	/*
	 * 容器啟動以後,會立刻創建過濾器實例.
	 * 註:只會創建一個.
	 */
	
	public CommentFilter2() {
		System.out.println(
				"CommentFilter2's constructor");
	}

	public void destroy() {
		
		
	}
	/**
	 * 容器調用doFilter方法來處理請求(類似於service方法).
	 * FilterChain:如果調用了該對象的doFilter方法,
	 * 則容器繼續向後執行.否則,中斷請求,返回結果.
	 */
	public void doFilter(
			ServletRequest arg0, 
			ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		System.out.println("doFilter2 begin...");
		
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String content = request.getParameter("content");
		if(content.length() >10){
			
			out.println("評論字數過多");
			
		}else{
			//繼續向後調用
			arg2.doFilter(arg0, arg1);
		}
		System.out.println("doFilter2 end.");
		
	}
	/**
	 * 實例化之後,容器會立即調用init方法來完成初始化.
	 * 註:該方法只會執行一次.
	 * FilterConfig可以用來讀取初始化參數.
	 */
	public void init(FilterConfig arg0) 
			throws ServletException {
		System.out.println("CommentFilter2's init()");
		
	}
	
}
