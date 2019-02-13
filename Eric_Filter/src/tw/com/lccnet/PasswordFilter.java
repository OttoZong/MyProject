package tw.com.lccnet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(description = "驗證密碼", urlPatterns = { "/PasswordFilter" })
public class PasswordFilter implements Filter {
	private FilterConfig filterConfig;

	public PasswordFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String mypass = request.getParameter("password");// 輸入
		String initpass = filterConfig.getInitParameter("initPass");
		if (!initpass.equals(mypass)) {
			request.setAttribute("message", "密碼錯誤...");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}

}
