package cn.tedu.spring;

public class Person {
	public Person(){
		System.out.print("Person的構造方法被執行...");
	}
	//初始化方法.
	public void init(){
		System.out.println("Person.init()");	
	}
	
	//銷毀方法.
	public void destroy(){
		System.out.println("Person.destroy()");
	}
}
