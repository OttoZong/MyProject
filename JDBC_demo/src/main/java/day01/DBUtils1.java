package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils1 {
	public static Connection getConnection() throws Exception{
		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		//1.註冊驅動
		Class.forName(className);
		//2.獲得連接對象
		Connection conn = DriverManager.getConnection(user, user, password);
		return conn;
	}
	public static void closeConnection(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils1.closeConnection(conn);
			}
		}
	}
}
