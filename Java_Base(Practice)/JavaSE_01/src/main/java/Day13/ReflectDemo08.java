package Day13;

import java.lang.reflect.Method;

public class ReflectDemo08 {
	public static void main(String[] args)throws Exception{
		/**
		 * 案例:
		 * 
		 * 需求:檢查一個類是否包含
		 * service(Request req, Response res)方法,
		 * 如果包含這個方法,就執行這個方法. 不包含就拋出異常.
		 * 
		 * 提示: 類名, Request對象,Response對象作為參數輸入.
		 * 
		 */
		
		String className="day13.MyServlet";
		Request req = new Request();
		Response res = new Response();
		
		ReflectDemo08 demo = new ReflectDemo08();
		demo.execute(className, req, res);
	}
	
	public void execute(String className,Request request,Response response) throws Exception{
		Class cls = Class.forName(className);
		Method method = cls.getMethod("service", Request.class, Response.class);
		Object obj = cls.newInstance();
		method.invoke(obj, request, response);
	}
}
