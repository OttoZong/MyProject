package Day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ###訪問不可見方法
 * Java中的訪問修飾詞用於控制,方法和屬性的可見範圍.稱為封裝特性.
 * 
 * 反射API可以打破如上封裝,實現訪問不可見的方法和屬性!
 * 
 * 		method.setAccessible(true);
 * 
 * ###動態調用有參數的方法
 * 		
 * 		//找到方法
 * 			cls.getDeclaredMethod(方法名, 參數類型1, 參數類型2...)
 * 		//創建對象
 * 			obj=cls.newInstance();
 * 		//準備參數
 * 			Object method.invoke(obj, 參數1, 參數2, 參數3...)
 * 
 * ### 解耦
 * 解除耦合性: 減低/解除 兩段代碼(兩組組建)之間的耦合關係.
 * 
 * 		public void test(){
 * 			Foo foo = new Foo();
 * 			foo.test();
 * 		}
 * 
 * 利用反射API,可以實現一組組件與未來的一個組件的鬆散耦合,
 * 甚至可以在不知道類名、不知道方法名的情況下實現調用
 * 
 * ###動態訪問對象的屬性
 * 
 * 		Field 代表類中的屬性信息
 * 
 * 			//讀取對象obj的指定屬性,返回屬性的值
 * 			Object Files.get(obj)
 * 			//設置屬性的值
 * 			void Filed.set(obj,valiue);
 * 
 * 案例: 反射讀取對象的一個屬性
 * 
 * 		String class = in.newxLine();
 * 		String name = in.nextLine();
 * 		//動態加載類
 * 		Class cls =class.forName(className);
 * 		//動態創建一個對象
 * 		Object obj = cls.newInsstance();
 * 		//獲取類的一個屬性信息
 * 		fld = cls.getDeclaredField(name);
 * 		Object val = fld.get(obj);
 * 		System.out.println(val);
 * 
 * @author Otto
 *
 */
public class ReflectDemo04 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/**
		 * 利用反射動態調用方法
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("輸入類:");
		String className = in.nextLine();
		System.out.println("方法名:");
		String methodName = in.nextLine();
		System.out.println("參數類型:");
		String typeName = in.nextLine();
		System.out.println("參數值:");
		String paramValue = in.nextLine();
		
		//動態加載類
		Class cls=Class.forName(className);
		//參數類型轉換
		Class type = null;//方法的參數類型.
		Object param=null;//調用方法時候實際參數.
		if(typeName.equals("int")){
			//Java中int的類型表示為: int.class
			type = int.class;
			param = Integer.parseInt(paramValue);
			
		}else if(typeName.equals("double")){
			type = double.class;
			param =Double.parseDouble(className);
		}else if(typeName.equals("string")){
			type = String.class;
			param = paramValue;
		}
		//找到一個被執行的方法信息
		Method method=cls.getDeclaredMethod(methodName, type);
		
		System.out.println(method);
		
		//動態創建對象
		Object obj = cls.newInstance();
		/*
		 * 執行方法
		 * obj代表包含方法的對象.
		 * param代表執行方法時候的實際參數.
		 * param的數據類型要與 type一致.
		 */
		Object value = method.invoke(obj, param);
		System.out.println(value);
		
	}
}


