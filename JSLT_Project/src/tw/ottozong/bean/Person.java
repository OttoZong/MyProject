package tw.ottozong.bean;

public class Person {
	private String Name;
	private Integer Age;
	private String Country;
	
	
	
	public Person() {
		super();
		
	}
	
	
	
	public Person(String name, Integer age, String country) {
		super();
		this.Name = name;
		Age = age;
		Country = country;
	}



	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}



	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", Country=" + Country + "]";
	}
	
	
}
