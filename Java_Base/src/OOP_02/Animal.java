package OOP_02;

public class Animal {
	private String name;
	private int id;

	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}

	public void eat() {
		System.out.println(name + "正在吃");
	}

	public void sleep() {
		System.out.println(name + "正在睡");
	}

	public void introduction() {
		System.out.println("大家好！我是" + id + "号" + name + ".");
	}
}

/*
 * public class Animal { private String name; private int id; public
 * Animal(String myName, String myid) { //初始化属性值 } public void eat() {
 * //吃东西方法的具体实现 } public void sleep() { //睡觉方法的具体实现 } }
 * 
 * public class Penguin extends Animal{ }
 */

/*
 * public interface A { public void eat(); public void sleep(); }
 * 
 * public interface B { public void show(); }
 * 
 * public class C implements A,B { }
 */