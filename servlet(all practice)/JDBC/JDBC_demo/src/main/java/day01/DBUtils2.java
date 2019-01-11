package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtils2 {

	public static Connection getConnection() throws Exception{
		String className="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		Class.forName(className);
		Connection conn = DriverManager.getConnection(url,user,password);
		return null;
	}
	public static void closeConnection(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
