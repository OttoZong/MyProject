package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDemo {
	public static void main(String[] args) {
		//1.獲得連結對象
		Connection conn = null;
		try{
			conn=DBUtils1.getConnection();
		//2.獲取statment對象
			Statement sta = conn.createStatement();
		//3.處理sql語句
			String sql="select 'hello' form dual";
			ResultSet rs = sta.executeQuery(sql);
		//4.處理結果集
			while(rs.next()){
				String str = rs.getString(1);
				System.out.println(str);
			}
			rs.close();
			sta.close();
		}catch(Exception e){
			// TODO: handle exception
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
