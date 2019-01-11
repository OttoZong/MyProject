package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo1 {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn=DBUtils2.getConnection();
			Statement sta = conn.createStatement();
			String sql = "select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				String str = rs.getString(1);
				System.out.println(str);
			}
			rs.close();
			sta.close();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtils2.closeConnection(conn);
		}
	}
}
