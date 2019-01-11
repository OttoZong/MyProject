package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo5 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
//			conn = DBUtils3.getConnection();
//			Statement sta = conn.createStatement();
//			String sql="create table t11(" 
//					+ "id int,name varchar(10)," 
//					+ "age int)";
//			sta.execute(sql);
			
//			conn = DBUtils3.getConnection();
//			String sql = "insert into t11 values(?,?,?)";
//			//預編譯語句
//			PreparedStatement ps = conn.prepareStatement(sql);
//			/*
//			 * 將sql語句送到數據庫,並創建執行計畫
//			 * 按照順序和數量發送參數
//			 * 把ps看做沒有執行的執行計畫
//			 * 通過ps對象把執行計畫中的參數填上
//			 */
//			ps.setInt(1, 1);
//			ps.setString(2, "lucy");
//			ps.setInt(3, 18);
//			int n = ps.executeUpdate();
//			System.out.println(n);
//			ps.setString(2, "lily");
//			ps.setInt(3, 20);
//			n = ps.executeUpdate();
//			System.out.println(n);
			
			conn = DBUtils3.getConnection();
			String sql = "select * from t11 where name like ?";
			//將sql語句發送到數據庫,創建執行計畫.
			PreparedStatement ps = conn.prepareStatement(sql);
			//按照順序給ps(執行計畫)對象添加參數.
			ps.setString(1, "L%");
			//執行計畫
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String str= rs.getString(2);
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBUtils3.closeConnection(conn);
		}

	}
}
