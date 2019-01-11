package day01;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtiles4 {
	//1.Ū���t�m��󪺰Ѽ�.
	static String className;
	static String url;
	static String user;
	static String password;
	//�b�R�A��������Ū���N�X,�O�ҥu����@��.
	static{
		//���properties��H.
		Properties cfg = new Properties();
		//��t�m����ഫ�y.
		InputStream inStream = DBUtiles4.class
				.getResourceAsStream("db.properties");
		//Ū���y
		try{
			cfg.load(inStream);
			className = cfg.getProperty("jdbc.className");
			url = cfg.getProperty("jdbc.url");
			user = cfg.getProperty("jdbc.user");
			password=cfg.getProperty("jdbc.password");
			System.out.println(className);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	//2.getConnection
	public static Connection getConnection() throws Exception{
		Class.forName(className);
		Connection conn=DriverManager.getConnection(url,user,password);
		return conn;
	}
	//3.
/*
 * 1.Ū���t�m��󪺰Ѽ�
 * 2.getConnection
 * 3.closeConnection
 */
	public static void colesConnection(Connection conn){
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
