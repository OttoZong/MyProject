package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo3 {
	public static void main(String[] args) {
		Connection conn=null; //單線程執行
		try {
			//獲得conn對象
			conn=DBUtiles4.getConnection();
			//獲得statement
			Statement sta = conn.createStatement();
			//執行sql語句
			String sql="select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			//處理結果集
			while(rs.next()){
				String str = rs.getString(1);
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtiles4.colesConnection(conn);
		}	
	}
}
