package Day06;
/**
 * 測試異常拋出相關操作
 * @author Otto
 *
 */
public class Throws_person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException{
		if(age<0 || age>100) {
			/*
			 * throw用於主動拋出一個異常
			 * 除了RuntimeException及其他子類型異常外,
			 * 拋出什麼異常就必須在當前方法上適用throws聲明
			 * 該類型異常的拋出定義已通知調用者處理該異常.
			 * 
			 * RuntimeException 運行值異常
			 */
//			throw new RuntimeException("年齡不合法!");
//			throw new Exception("年齡不合法!");
			throw new IllegalAgeException("年齡不合法!");
			
		}
		this.age = age;
	}
	
	
}
