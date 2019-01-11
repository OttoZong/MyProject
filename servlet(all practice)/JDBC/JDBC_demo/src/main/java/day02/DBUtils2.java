package day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils2 {
	// 1.獲得參數.
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
			// 設置必選參數.
			ds.setDriverClassName(driverClassName);
			ds.setUrl(url);
			ds.setUsername(username);
			ds.setPassword(password);
			// 設置策略參數.
			ds.setInitialSize(initialSize);
			ds.setMaxActive(maxActive);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2.通過連接池獲得連接對象.
	public static Connection getConnection() throws SQLException {
		Connection conn = ds.getConnection();
		return conn;
	}

	// 3.歸還連接對象.
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
