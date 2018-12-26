package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CommentFilter implements Filter{

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

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		
	}
	/**
	 * 實例化之後,容器會立即調用init方法來完成初始化.
	 * 該方法只會執行一次.
	 */
	public void init(FilterConfig arg0) 
			throws ServletException {
		
		
	}
	
}
