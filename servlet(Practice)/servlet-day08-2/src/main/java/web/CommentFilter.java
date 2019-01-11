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

public class CommentFilter implements Filter{
	
	private FilterConfig config;
	
	/*
	 * 容器啟動以後,會立刻創建過濾器實例.
	 * 註:只會創建一個.
	 */
	
	public CommentFilter() {
		System.out.println(
				"CommentFilter's constructor");
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
		
		System.out.println("doFilter begin...");
		
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String content = request.getParameter("content");
		//讀初始化參數,來獲得敏感字.
		String illegal = config.getInitParameter("illegal");
		
		if(content.indexOf(illegal) != -1){
			//包含敏感字,則中斷請求,返回結果.
			out.println("評論包含敏感詞彙");			
		}else{
			//繼續向後調用.
			arg2.doFilter(arg0, arg1);
		}
		System.out.println("doFilter end.");
		
	}
	/**
	 * 實例化之後,容器會立即調用init方法來完成初始化.
	 * 註:該方法只會執行一次.
	 * FilterConfig可以用來讀取初始化參數.
	 * 
	 */
	public void init(FilterConfig arg0) 
			throws ServletException {
		config = arg0;
		System.out.println("CommentFilter's init()");		
	}

}
