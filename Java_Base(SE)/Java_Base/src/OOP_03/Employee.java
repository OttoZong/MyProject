package OOP_03;

/*
 * 我們將介紹在Java中，當設計類時，被重寫的方法的行為怎樣影響多態性。

我們已經討論了方法的重寫，也就是子類能夠重寫父類的方法。

當子類對象調用重寫的方法時，調用的是子類的方法，而不是父類中被重寫的方法。

要想調用父類中被重寫的方法，則必須使用關鍵字super。*/
/* 文件名 : Employee.java */
public class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number) {
		System.out.println("Employee 构造函数");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public void mailCheck() {
		System.out.println("邮寄支票给： " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public int getNumber() {
		return number;
	}
}
