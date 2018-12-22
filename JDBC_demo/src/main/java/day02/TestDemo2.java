package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public class TestDemo2 {
	public static void main(String[] args) {
		String className="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		//創建連接池管理員對象.
		BasicDataSource ds = new BasicDataSource();
		//設置必選參數.
		ds.setDriverClassName(className);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		//設置連接池的管理策略參數.
		//啟動時連接池中連接對象的數量.
		ds.setInitialSize(2);
		//設置最大的連接對象.
		ds.setMaxActive(2);
		Connection conn = null;
		try {
			conn=ds.getConnection();
			Statement sta = conn.createStatement();
			String sql="select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				String str = rs.getString(1);
				System.out.println(str);
			}
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			try {
				//這裡不是關閉,而是歸還.
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
