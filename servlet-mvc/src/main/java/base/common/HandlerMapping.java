package base.common;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import base.annotation.RequestMapping;

/**
 * 建立請求路徑與模型定義關係
 * (比如/hello.do應該由
 * HelloController的hello方法來處理)
 * 該工作交給HandlerMapping來處理.
 * 
 * @author Otto
 * 
 */
public class HandlerMapping {
	
	//urlMap用於存放請求路徑與模型的對應關係.
	private Map<String,URLHandler> urlMap =
			new HashMap<String,URLHandler>();
	
	/**
	 * beans:存放模型的集合.
	 * 
	 * 該方法遍歷整個集合,對於某個bean,
	 * 利用java反射讀取存放到@RequestMapping
	 * 上的路徑,然後建立請求路徑與模型的對應關係.
	 */
	public void process(List beans){
		for(Object obj : beans){
			//獲取所有方法(Method)
			Class clazz = obj.getClass();
			
			Method[] methods = clazz.getDeclaredMethods();
			
			for(Method mh : methods){
				//獲得方法上的註解(@RequestMapping).
				RequestMapping rm = 
						mh.getAnnotation(
						RequestMapping.class);
				//如果方法上沒有註解，則該方法.
				//不是一個用來處理請求的方法.
				if(rm == null){
					continue;
				}
				
				//獲得註解上的路徑.
				String path = rm.value();
				
				//將路徑與模型的對應關係添加到urlMap.
				urlMap.put(path, new URLHandler(obj,mh));
				
			}
		}
		System.out.println("urlMap:" + urlMap);
	}
	
	/**
	 * 依據請求路徑找到對應的模型.
	 */
	public URLHandler getHandler(String path){
		return urlMap.get(path);
	}
}
