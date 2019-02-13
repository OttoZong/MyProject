package tw.com.lccnet;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(description = "驗證帳號", urlPatterns = { "/NameFilter" })
public class NameFilter implements Filter {
	private FilterConfig filterConfig;

	public NameFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String myname = request.getParameter("username");// 輸入
		String initName = filterConfig.getInitParameter("initName");
		if (!initName.equals(myname)) {
			request.setAttribute("message", "帳號錯誤...");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}

}
