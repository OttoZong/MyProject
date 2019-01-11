package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo2 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn=DBUtils3.getConnection();
			Statement sta = conn.createStatement();
			String sql="select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				String str = rs.getString(1);
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils3.closeConnection(conn);
		}		
	}
}
