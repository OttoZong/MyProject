package day02;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDemo {
	public static void main(String[] args) {
		try {
			Connection conn = DBUtils2.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
