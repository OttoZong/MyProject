package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDemo3 {
	
	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn=DBUtils3.getConnection();
			Statement sta = conn.createStatement();
			String sql = "select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			rs.close();
			sta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils3.closeConnection(conn);
		}
	}
}
