package Day13;

import java.util.Scanner;

/**
 * ##靜態調用
 * 如下程序邊以後就已經確定了執行次序,執行期間按照編譯時候確定的執行順序執行,這種情況稱為靜態執行.
 * Foo foo = new Foo();
 * foo.test();
 * 
 * ##動態執行
 * Java 反射API提供了動態執行機制
 * 1.動態加載類.
 * 2.動態創建對象.
 * 3.動態調用屬性和方法.
 * 
 * ##動態加載類
 * 
 * 在程序運行之前不知道類名,在運行期間動態根據類名加載類道內存(方法區)
 * Class cls = Class.forName(類名);
 * 
 * ##動態創建對象
 * 
 * 如下方可以動態創建類的一個實例
 * Object obj = cls.newInstance();
 * 
 * 使用前提:cls代表的類必須存在無參數構造器!
 * 如果沒有無參數構造器則拋出異常.反射中可以調用有參數構造器(略).
 * 
 * @author Otto
 *
 */
public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/**
		 * 利用反射API動態加載類到方法區
		 * Class cls = class.forName(類名)
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("輸入類名:");
		String className = in.nextLine();
		/*
		 * 動態加載類到方法區,如果類名錯誤,
		 * 則拋出"類沒有找到的運行異常"
		 */
		Class cls = Class.forName(className);
		System.out.println(cls);
		//進一步檢查類的詳細信息...
		
		/*
		 * 利用反射API動態創建對象
		 */
		Object obj = cls.newInstance();
		System.out.println(obj);
	}
}
