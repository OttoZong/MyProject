package Day05;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用當前類的實例測試對象流的對象讀寫操作
 * 
 *當前類的實例若希望被對象流讀寫,那麼必須實現
 *java.io.Serializable接口,並且,當前類中所有
 *引用類型的屬性,他們的類也必須都實現該接口.
 *
 *當一個類實現了Serializable接口,那麼在編譯
 *的時候,編譯器會隱含在class文件中添加一個方法,
 *用將當前對象轉化為一個字節.
 * @author Otto
 *
 */
public class Object_Person implements Serializable{
	/**
	 * 當一個類實現了Serializable接口後
	 * 應當定義一個常量:serialVersionUID
	 * 它是序列化版本號,若不指定,編譯器會
	 * 在編譯當前類時,根據當前類結構自動生成一個版本號
	 * 
	 * 版本號決定反序列化當前類實例是否可以成功.
	 * 當版本號一致時,反序列化成功;
	 * 不一致時,對象輸入流在進行反序列化時會拋出異常.
	 * 
	 * 若當前類結構發生變化,但是版本號沒有改變的前提下,
	 * 原來的對象是可以反序列化的,
	 * 這是會採取兼容模式,即:還原原有屬性.
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient String[] otherInfo;
	/*
	 * 當一個屬性被transient修飾後
	 * 那麼該屬性在對象序列化時會被忽略
	 */
	
	public Object_Person() {
	}

	public Object_Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	@Override
		public String toString() {
			return name+","+age+","+gender+","+Arrays.toString(otherInfo);
		}
	
}
