package day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils3 {
	// 1.獲取參數.
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
			// 配置文件中6個參數.
			driverClassName=cfg.getProperty("jdbc.class");
			url=cfg.getProperty("jdbc.url");
			username=cfg.getProperty("jdbc.user");
			password=cfg.getProperty("jdbc.password");
			initialSize=Integer.parseInt(cfg.getProperty("InitialSize"));
			maxActive=Integer.parseInt(cfg.getProperty("MaxActive"));
			//設置4個必要參數.
			ds.setDriverClassName(driverClassName);
			ds.setUrl(url);
			ds.getUsername();
			ds.getPassword();
			//設置2個策略參數.
			ds.setInitialSize(initialSize);
			ds.setMaxActive(maxActive);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 2.獲取連接對象.
	public static Connection getConnection() throws SQLException{
		Connection conn = ds.getConnection();
		return conn;
	}
	// 3.歸還連接對象.
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
