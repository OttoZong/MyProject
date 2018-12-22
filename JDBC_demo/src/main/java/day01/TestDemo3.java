package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo3 {
	public static void main(String[] args) {
		Connection conn=null; //��u�{����
		try {
			//��oconn��H
			conn=DBUtiles4.getConnection();
			//��ostatement
			Statement sta = conn.createStatement();
			//����sql�y�y
			String sql="select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			//�B�z���G��
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
