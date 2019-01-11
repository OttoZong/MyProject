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
		//�Ыسs�����޲z����H.
		BasicDataSource ds = new BasicDataSource();
		//�]�m����Ѽ�.
		ds.setDriverClassName(className);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		//�]�m�s�������޲z�����Ѽ�.
		//�Ұʮɳs�������s����H���ƶq.
		ds.setInitialSize(2);
		//�]�m�̤j���s����H.
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
				//�o�̤��O����,�ӬO�k��.
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
