package day01;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils3 {
	static String className;
	static String url;
	static String user;
	static String password;
	
	//去讀配置文件
	static{
		//創建properties對象
		Properties cfg = new Properties();
		//讀取配置文件
		InputStream inStream = DBUtils3.class.getClassLoader().getResourceAsStream("db.properties");
		try{
			cfg.load(inStream);
			className=cfg.getProperty("jdbc.className");
			url=cfg.getProperty("jdbc.url");
			user=cfg.getProperty("jdbc.user");
			password=cfg.getProperty("jdbc.password");
		}catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection() throws Exception{
		Class.forName(className);
		Connection conn=DriverManager.getConnection(url,user,password);
		
		return conn;
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
