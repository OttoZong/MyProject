/*
* Copyright (c) 1994, 2018, lccnet and/or  偷我程式者，將受到神的制裁
*/

package tw.com.lccnet.bean;

/**
*	專案名稱:JDBC
* 	建立時間:2018年10月18日 下午8:46:20
*	@auther EricYang
*	Email:eric.tw.2015@gmail.com
*	@version 1.0V
* 
*	TODO
*/

public class Customer {
	//封裝
	//bean id.name....tables
	private int id;
	private String name;
	private String age;
	private String email;
	private String address;
	
	public Customer() {}
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
