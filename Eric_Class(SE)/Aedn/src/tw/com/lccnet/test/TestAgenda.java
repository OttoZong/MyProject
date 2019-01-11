package tw.com.lccnet.test;

import tw.com.lccnet.DB.ConectaDB;

public class TestAgenda {
	public static void main(String[] args){
		ConectaDB db = new ConectaDB();
		db.setMessage("haha");
		System.out.println(db.getMessage());
	}
}
