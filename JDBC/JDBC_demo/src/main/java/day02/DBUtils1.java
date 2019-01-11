package day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils1 {
	 //1.�[��4�ӰѼ�.
	static String className;
	static String url;
	static String user;
	static String password;
	//�Ы�properties
	static{
		Properties cfg=new Properties();
		InputStream inStream=DBUtils1.class
				.getClassLoader()
				.getResourceAsStream("db.properties");
		try{
			cfg.load(inStream);
			className=cfg.getProperty("jdbc.className");
			url=cfg.getProperty("jdbc.url");
			user=cfg.getProperty("jdbc.user");
			password=cfg.getProperty("jdbc.password");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	//2.��o�s����H��k.
	public static Connection getConnection() throws Exception{
		Class.forName(className);
		Connection conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
	//3.�����s����H��k.
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
