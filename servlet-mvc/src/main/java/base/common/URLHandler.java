package base.common;

import java.lang.reflect.Method;

public class URLHandler {
	private Object obj;
	private Method mh;
		
	public URLHandler(Object obj, Method mh) {
		super();
		this.obj = obj;
		this.mh = mh;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Method getMh() {
		return mh;
	}
	public void setMh(Method mh) {
		this.mh = mh;
	}
	
	
}
