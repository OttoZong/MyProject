package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestCase2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Scanner sc = new Scanner(System.in);
		//從控制台讀取類名.
		String className = sc.nextLine();
		System.out.println("className:" + className);
		
		//完成類的加載.
		Class clazz = Class.forName(className);
		//實例化.
		Object obj = clazz.newInstance();
		//獲得所有方法.
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method mh : methods){
			//只執行帶有@Test註釋的方法.
			/*
			 * 獲得方法前的註解(這裡是獲得@Test)
			 */
			Test test = mh.getAnnotation(Test.class);
			
			if(test != null){
				//獲得@Test註解的屬性值.
				String prop = test.value();
				//該方法帶有@Test註解,則執行.
				System.out.println("prop:"+ prop);
				mh.invoke(obj);
			}		
		}		
	}	
}
