package Day13;

import java.lang.reflect.Field;

/**
 * 修改屬性
 *	//obj = foo(age=5, name=Tom)
 *	//fld = age;
 *	//value = 10;
 *	//檢查屬性  age=10;
 *	String className = in.nextLine();
 *	String name = in.nextLine();
 *	String value = in.nextLine();
 *	//動態加載類
 *	cls = Class.forName(className);
 *	//動態創建一個對象
 *	Object obj = cls.newInstance();
 *	//獲取類的一個屬性信息
 *	fld = cls.getDeclaredField(name);
 *
 *
 * 	fld.set(obj, value);
 * 	System.out.println(obj);
 * 
 * ###經典案例
 * 
 * 需求:檢查一個類是否包含 service(Request req, Response res)方法,
 * 如果包含這個方法,就執行這個方法. 不包含就拋出異常.
 * 提示: 類名,Request對象,Response對象作為參數輸入.
 * 
 * 設計:
 * 		public void execute(String className, Request req, response res) throw Exception{
 * 		//動態加載類.
 * 		//根據方法簽名查找方法 "service" Request Response
 * 		//創建對象, 執行方法.
 * 		}
 * 
 * 這個設計的好處: 解耦
 * 
 * ### 很多框架使用反射
 * 
 * 框架為了解決對未來未知組件進行兼容管理,經常使用反射API.
 * 
 * @author Otto
 *
 */
public class ReflectDemo06 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		/**
		 * 獲取字符串的char[] value屬性.
		 * 因為屬性value是私有的,所以採用反射API訪問.
		 */
		
		String s = "今天你吃了嗎?";
		//找到屬性信息
		Class cls = String.class;
		Field fld = cls.getDeclaredField("value");
		char[] chs = (char[])fld.get(s);
		System.out.println(chs);
		for(char c : chs){
			System.out.println(c);
		}
		//思考:如下代碼是什麼結果.
		chs[0]='K';
		System.out.println(s);
	}
}
