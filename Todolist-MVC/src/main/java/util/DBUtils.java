package util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	// 1.獲得配置數據.
	static String driverClassName;
	static String url;
	static String userName;
	static String password;

	static int initialSize;
	static int maxActive;
	static BasicDataSource bs = null;
	static {
		Properties cfg = new Properties();
		InputStream inStream = DBUtils.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			cfg.load(inStream);
			driverClassName = cfg.getProperty("driver");
			url = cfg.getProperty("url");
			userName = cfg.getProperty("user");
			password = cfg.getProperty("password");
			initialSize = Integer.parseInt(cfg.getProperty("initSize"));
			maxActive = Integer.parseInt(cfg.getProperty("maxActive"));
			bs = new BasicDataSource();
			bs.setDriverClassName(driverClassName);
			bs.setUrl(url);
			bs.setUsername(userName);
			bs.setPassword(password);
			bs.setInitialSize(initialSize);
			bs.setMaxActive(maxActive);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 2.獲得連接對象方法.
	public static Connection getConnection() throws SQLException {
		Connection conn = bs.getConnection();
		return conn;
	}

	// 3.歸還連接對象.
	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 4.rollback方法
	public static void rollBack(Connection conn) {
		if (conn != null) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}

}