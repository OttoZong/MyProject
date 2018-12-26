package tw.com.lccnet.bean;
/**
 * Source --> Constructor using Fields.
 * Source --> Getters and Setters.
 * @author Otto
 *
 */
public class Customer {
	private int id;
	private String name;
	private int age;
	
	public Customer() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
}
