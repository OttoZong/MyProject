package OOP_01;

/* 文件名: EncapTest.java */
public class EncapTest {

	private String name;
	private String idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}

	/*
	 * 以上實例中public方法是外部類訪問該類成員變量的入口。
	 * 
	 * 通常情況下，這些方法被稱為getter和setter方法。
	 * 
	 * 因此，任何要訪問類中私有成員變量的類都要通過這些getter和setter方法。
	 */

	/*
	 * 以上代碼編譯運行結果如下: Name : James Age : 20
	 */
}