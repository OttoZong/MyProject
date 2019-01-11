package day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils2 {
	// 1.��o�Ѽ�.
	static String driverClassName;
	static String url;
	static String username;
	static String password;
	static int initialSize;
	static int maxActive;
	static BasicDataSource ds = null;
	static {
		ds = new BasicDataSource();
		Properties cfg = new Properties();
		InputStream inStream = DBUtils2.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			cfg.load(inStream);
			driverClassName = cfg.getProperty("className");
			url = cfg.getProperty("jdbc.url");
			username = cfg.getProperty("jdbc.user");
			password = cfg.getProperty("jdbc.password");
			initialSize = Integer.parseInt(cfg.getProperty("InitialSize"));
			maxActive = Integer.parseInt(cfg.getProperty("MaxActive"));
			// �]�m����Ѽ�.
			ds.setDriverClassName(driverClassName);
			ds.setUrl(url);
			ds.setUsername(username);
			ds.setPassword(password);
			// �]�m�����Ѽ�.
			ds.setInitialSize(initialSize);
			ds.setMaxActive(maxActive);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2.�q�L�s������o�s����H.
	public static Connection getConnection() throws SQLException {
		Connection conn = ds.getConnection();
		return conn;
	}

	// 3.�k�ٳs����H.
	public static void cloesConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
