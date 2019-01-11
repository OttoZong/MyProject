package day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils3 {
	// 1.����Ѽ�.
	static String driverClassName;
	static String url;
	static String username;
	static String password;

	static int initialSize;
	static int maxActive;

	static BasicDataSource ds = null;
	static{
		ds=new BasicDataSource();
		Properties cfg=new Properties();
		InputStream inStream = DBUtils3.class
				.getClassLoader()
				.getResourceAsStream("db.properties");
		try {
			cfg.load(inStream);
			// �t�m���6�ӰѼ�.
			driverClassName=cfg.getProperty("jdbc.class");
			url=cfg.getProperty("jdbc.url");
			username=cfg.getProperty("jdbc.user");
			password=cfg.getProperty("jdbc.password");
			initialSize=Integer.parseInt(cfg.getProperty("InitialSize"));
			maxActive=Integer.parseInt(cfg.getProperty("MaxActive"));
			//�]�m4�ӥ��n�Ѽ�.
			ds.setDriverClassName(driverClassName);
			ds.setUrl(url);
			ds.getUsername();
			ds.getPassword();
			//�]�m2�ӵ����Ѽ�.
			ds.setInitialSize(initialSize);
			ds.setMaxActive(maxActive);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 2.����s����H.
	public static Connection getConnection() throws SQLException{
		Connection conn = ds.getConnection();
		return conn;
	}
	// 3.�k�ٳs����H.
	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
