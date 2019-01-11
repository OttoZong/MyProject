package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo1 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn=DBUtils1.getConnection();
			Statement sta = conn.createStatement();
			String sql = "select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				String str = rs.getString(1);
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils1.closeConnection(conn);
		}
	}
}
