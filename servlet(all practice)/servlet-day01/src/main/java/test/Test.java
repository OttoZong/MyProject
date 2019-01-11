package test;

import java.sql.SQLException;

import util.DBUtils;


public class Test {
	public static void test1() throws SQLException{
		System.out.println(
				DBUtils.getConnection());
	}
	
	public static void main(String[] args) throws SQLException {
		test1();
	}
	
	
}
