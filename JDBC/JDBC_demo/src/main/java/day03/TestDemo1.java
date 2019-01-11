package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDemo1 {

	public static void main(String[] args) {
		//
		Connection conn=null;
		try {
			conn=DBUtils.getConnection();
			String sql="select name from t11 where name like ?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "L%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
		}finally {
			DBUtils.closeConnection(conn);
		}
	}

}
