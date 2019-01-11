package Day02;

public class Person {
	private int age;
	
	public Person() {

	}

	public void setAge(int age) {
		if(age<0 || age>100) {
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
