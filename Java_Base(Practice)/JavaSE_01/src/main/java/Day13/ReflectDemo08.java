package Day13;

import java.lang.reflect.Method;

public class ReflectDemo08 {
	public static void main(String[] args)throws Exception{
		/**
		 * �ר�:
		 * 
		 * �ݨD:�ˬd�@�����O�_�]�t
		 * service(Request req, Response res)��k,
		 * �p�G�]�t�o�Ӥ�k,�N����o�Ӥ�k. ���]�t�N�ߥX���`.
		 * 
		 * ����: ���W, Request��H,Response��H�@���Ѽƿ�J.
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
