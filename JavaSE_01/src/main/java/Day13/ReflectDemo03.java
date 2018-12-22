package Day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ###必須使用反射實現的案例:
 * 
 * 執行一個類中的全部以test為開頭的方法
 * 這些方法都是非靜態方法,方法沒有返回值,沒有參數.
 * 
 * 如上案例必須使用反射實現!
 * 
 * 實現過程:
 * 
 * 0.動態輸入一個類名.
 * 1.動態加載類型.
 * 2.動態創建對象.
 * 3.利用反射查找全部方法信息.
 * 4.找到以test開頭方法.
 * 5.利用反射動態執行對象的方法.
 * 
 * @author Otto
 *
 */
public class ReflectDemo03 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		/**
		 *	執行一個類中的全部以test為開頭的方法
		 *	這些方法都是非靜態方法,方法沒有返回值,沒有參數.
		 */
		//動態加載類
		Scanner in = new Scanner(System.in);
		System.out.println("輸入類:");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		//動態創建對象
		Object obj = cls.newInstance();
		//動態檢查類中的全部方法信息
		Method[] methods = cls.getDeclaredMethods();
		/**
		 *###動態調用有參數的方法
		 * 		
		 * //找到方法
		 * cls.getDeclaredMethod(方法名, 參數類型1, 參數類型2...)
		 * //創建對象
		 * obj=cls.newInstance();
		 * //準備參數
		 * Object method.invoke(obj, 參數1, 參數2, 參數3...)
		 */
		cls.getDeclaredMethods();
		
		for(Method method : methods){
			//System.out.println(method);
			/*
			 *method 代表一個方法的相關信息.
			 *method.getName() 返回方法名.
			 */
			String name = method.getName();
			//System.out.println(name);
			if(name.startsWith("test")){
				System.out.println(method);
				
				/*
				 * Access 訪問.
				 * Accessible 可訪問.
				 * 可以打破封裝,訪問不可見的方法.
				 */
				method.setAccessible(true);
			/*
			 * method.invoke()方法用於調用於在對象上調用(invoke)
			 * 當前method對應的方法,必須傳遞包含方法的對象作為參數!
			 */
				Object val = method.invoke(obj);
				System.out.println(val);
			}
			
		}
	}
}
