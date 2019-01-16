package model;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connexion {
	private String username="root";
	private String password="123456";
	private String hostname="localhost";
	private String post="3306";
	private String database="comercio";
	private String classname="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://"+hostname+":"+post+"/"+database;
	
	private Connection conn;
	
	public Connexion(){
		try{
			Class.forName(classname);
			conn=(Connection) DriverManager.getConnection(url,username,password);	
		}catch(ClassNotFoundException|SQLException e){
			System.out.println(e.getMessage());
		}
	}
	public Connection getConnection(){
		return conn;
	}
}
