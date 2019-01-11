package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private String JDBC_DRIVER="com.mysql.jdbc.Driver";
	private String JDBC_URL="mysql:jdbc:///ServletMVC";
	private String JDBC_USER="root";
	private String JDBC_PASS="123456";
	
	private DBConnection(){};
	
	public static DBConnection getMyConnection(){
		return new DBConnection();
	}
	
	public Connection getConneciton(){
		Connection conn =null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void close(Connection conn){
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(PreparedStatement ps){
		if(ps != null)
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(Statement st){
		if(st != null)
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(ResultSet rs){
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	
	

}
