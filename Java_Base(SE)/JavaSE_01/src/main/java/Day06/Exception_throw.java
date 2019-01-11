package Day06;
/**
 * 異常的拋出
 */
import Day02.Person;

public class Exception_throw {
	public static void main(String[] args) {
		System.out.println("程序開始了");
			try {
				Person p = new Person();
				/*
				 * 當調用一個含有throws聲明異常拋出的方法時,
				 * 編譯器要求必須處理這些異常.
				 * 處理方式有兩種
				 * 1:使用try-catch捕獲異常並處理
				 * 2:繼續在當前方法上使用throws,
				 * 	  將該異常聲明拋出.
				 */
				p.setAge(20);
				System.out.println(p.getAge());
			} catch (Exception e) {		//catch (IllegalAgeException e)
				e.printStackTrace();
			}
			
		System.out.println("程序結束了");
	}
}
