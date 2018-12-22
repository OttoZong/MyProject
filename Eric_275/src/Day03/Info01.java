package Day03;

public interface Info01 {
	/*
	 * interface沒有建構子,不能new.
	 * 屬性不可私有化(它是常數).
	 */
	public static final int AGE=10;
	
	
	//只能使用抽象方法
	public abstract void get01();
	
	public void get02();
}
