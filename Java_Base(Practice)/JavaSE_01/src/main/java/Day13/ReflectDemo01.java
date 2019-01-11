package Day13;
/**
 *	反射
 *java的動態機制,用於在運行期間檢查對象的類型,
 *檢查對象的類結構(屬性,方法等),還可以動態加載類,動態創建對象,動態訪問屬性和方法等...
 *
 * 反射是 java 的 api
 * public void print(Object obj){
 * //利用反射API,動態檢查obj引用的對象類型
 * Class cls = obj.getClass();
 * System.out.println(obj);
 * }
 * 經典面試題目:Eclipse 中快捷菜單用了什麼技術實現
 * 答案: 當然是反射技術,反射API
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo01 {
	/**
	 * 反射API.
	 * 動態檢查對象的類型.
	 * @param args
	 */
	public static void main(String[] args) {
		print(1);
		print("1");
		print('1');
	}
	public static void print(Object obj){

		/**
		 *動態檢查obj對象的類型.
		 *getClass方法在Object類上定義,
		 *被所有對象繼承,全部對象上都有的方法.
		 */
		Class cls = obj.getClass();
		/*
		 * class提供了更加詳盡的類型詳細信息.
		 * 檢查方法:檢查屬性,檢查方法,檢查構造器...
		 * 動態檢查 Integer等類型的屬性.
		 * 
		 * Declared: 聲明
		 * Field:	子段,屬性
		 */
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields){
			System.out.println(field);
		}
		//獲取當前類型上聲明的全部方法信息
		//getDeclaredMethods
		Method[] methods = cls.getDeclaredMethods();
		
		for(Method method : methods){
			System.out.println(method);
		}
		
		System.out.println(cls);
		System.out.println(obj);
	}
}
