package OOP_01;

//1. 修改屬性的可見性來限制對屬性的訪問（一般限制為private），例如：

public class Person {
	private String name;
	private int age;

	/* 這段代碼中，將name和age屬性設置為私有的，
	 * 只能本類才能訪問，其他類都訪問不了，
	 * 如此就對信息進行了隱藏。 
	 * 文件名: EncapTest.java */
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
}
/*
 * 2. 對每個值屬性提供對外的公共方法訪問，
 * 也就是創建一對賦取值方法，用於對私有屬性的訪問，
 * 例如： 採用this關鍵字是為了解決實例變量
 * （private String name） 和局部變量setName(String name)
 * 中的name變量之間發生的同名的衝突。
 */
