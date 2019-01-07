package base.web;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import base.common.BeansManger;
import base.common.HandlerMapping;
import base.common.URLHandler;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	 *	BeansManager:負責解析配置文件,
	 *	將配置好的模型(比如HelloController)實例化,
	 *	並將這些實例存取到集合當中.
	 */
	private BeansManger bm = 
			new BeansManger();
	/*
	 * HandlerMapping:負責建立請求路徑與模型的對應關係.
	 * (比如"/hello.do"請求應該交給HelloController的hello方法來處理)
	 */
	private HandlerMapping hm = 
			new HandlerMapping();
	
	@Override
	public void init() throws ServletException {
		
		//讀取配置文件的位置及文件名.
		String configName = 
				getServletConfig()
				.getInitParameter("configLocation");
		
		System.out.println("configName:"+configName);
		/*
		 * 解析配置文件，利用Java反射，將配置文件中的類實例化並存放到集合當中.
		 */		
		try {
			
			//解析配置文件工作交給BeansManger.
			bm.parse(configName);
						
			/*
			 * 建立請求路徑與模型定義關係
			 * (比如/hello.do應該由
			 * HelloController的hello方法來處理)
			 * 該工作交給HandlerMapping來處理.
			 */
			hm.process(bm.getBeans());
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		
		request.setCharacterEncoding("utf-8");
		//讀取請求資源路徑.
		String uri = 
				request.getRequestURI();
		System.out.println("uri:" + uri);
		//獲得應用名.
		String contextPath = 
				request.getContextPath();
		System.out.println("contextPath:" + contextPath);
		//擷取請求資源路徑應用名之後的那一部分.
		String path = uri.substring(contextPath.length());
		System.out.println("path:"+path);
		
		//依據請求路徑找到對應的模型來處理.
		URLHandler urlHandler = hm.getHandler(path);
		System.out.println("urlHanlder:" 
				+ urlHandler);
		
		//調用模型的方法.
		Method mh = urlHandler.getMh();
		Object obj = urlHandler.getObj();
		
		//viewName:模型的方法執行完畢之後的返回值.
		Object viewName;
		
		try {
			/*
			 * 通過java反射,查看方法是否
			 * 需要request和response,如果需要,
			 * 則將這個兩個對象作為參數傳過去.
			 */
			//獲得方法所帶的參數的類似.
			Class[] types = 
					mh.getParameterTypes();
			
			if(types.length > 0){
				Object[] args = new Object[types.length];
				//該方法帶參數.
				for(int i = 0; i < types.length;i++){
					if(types[i] == HttpServletRequest.class){
						args[i] = request;
					}
					if(types[i] == HttpServletRequest.class){
						args[i] = response;
					}
				}
				//執行帶參的方法.
				viewName = mh.invoke(obj, args);
			}else{
				//執行不帶參數的方法.
				viewName = mh.invoke(obj);
			}
			
			System.out.println("viewName:" + viewName);
			//調用processView來處理視圖名(方法的返回結果).
			//(即跳轉到某個頁面).
			processView(viewName,request,response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}

	private void processView(Object viewName, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		/*
		 * 如果viewName是以"redirect:"開頭的,
		 * 則重定向,否則轉發.
		 */
		if(viewName.toString()
				.startsWith("redirect:")){
			//重定向.
			//生成重定向地址.
			String aimPath = request.getContextPath() + "/" 
					+ viewName.toString().substring("redirect:".length());
			response.sendRedirect(aimPath);
		}else{
			//轉發.
			/*
			 * 生成轉發的目的地地址.
			 */
			String aimPath = "/WEB-INF/" 
					+ viewName.toString() + ".jsp";
			System.out.println("aimPath:"+ aimPath);
			//轉發到目的地.
			request.getRequestDispatcher(aimPath)
			.forward(request, response);
		}
		
	}
}
