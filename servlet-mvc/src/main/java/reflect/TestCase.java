package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestCase {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Scanner sc = new Scanner(System.in);
		//從控制台讀取類名.
		String className = sc.nextLine();
		System.out.println("className:" + className);
		/*
		 * 類加載器(即ClassLoader,它是jvm提供的一個特殊對象)
		 * 依據類名,找到類的字節碼文件,然後讀取字節碼文件的內容,
		 * 並將其存放到方法區的對應的class對象裡面.
		 */
		Class clazz = Class.forName(className);
		/*
		 * 獲得該類的所有方法
		 */
		Object obj = clazz.newInstance();
		
		/*
		 * 獲得該類的所有的方法.
		 */
		Method[] methods = 
				clazz.getDeclaredMethods();
		for(Method mh : methods){
			//輸出方法名子.
			String mName = mh.getName();
			System.out.println("mName:" + mName);
			//返回值.
			Object returnVal;
			if("hello".equals(mName)){
				//執行帶參數值的方法.
				Object[] ags = new Object[]{"Sally"};
				returnVal = mh.invoke(obj, ags);
			}else{
				//執行各種方法.
				returnVal = mh.invoke(obj);
			}
			System.out.println("返回值:"+ returnVal);			
		}
	}
}
