/*
* Copyright (c) 1994, 2018, lccnet and/or  偷我程式者，將受到神的制裁
*/

package tw.com.lccnet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 專案名稱:JDBC 建立時間:2018年10月18日 下午8:01:18
 * 
 * @auther EricYang Email:eric.tw.2015@gmail.com
 * @version 1.0V
 * 
 *          TODO
 */

public final class DBManager {
	// 測試
	
	public  String JDBC_DRIVER = "";
	public  String JDBC_URL = "";
	public  String JDBC_USER = "";
	public  String JDBC_PASS = "";

	public static DBManager getConn() {
	
		return new DBManager();
	}
	
	
	
	public Connection getConnection() {
		Connection conn = null;
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

	public  void close(Connection conn) {
			if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}

	public  void close(Statement st) {
		if(st !=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public  void close(PreparedStatement ps) {
		if(ps !=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public  void close(ResultSet rs) {
		if(rs !=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
