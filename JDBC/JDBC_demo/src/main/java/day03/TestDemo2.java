package day03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestDemo2 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DBUtils.getConnection();
			Statement sta = conn.createStatement();
			String sql = "select * fro t11";
			ResultSet rs = sta.executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
//			//����d�ߦC���ƶq
//			int n = meta.getColumnCount();
//			System.out.println(n);
//			//����ؼЦC���C�W,�ѼƬ��C���U��.
//			String name1 = meta.getColumnName(1);
//			String name2 = meta.getColumnName(2);
//			String name3 = meta.getColumnName(3);
//			System.out.println(name1);
//			System.out.println(name2);
//			System.out.println(name3);
			
			for(int i =1; i<= meta.getColumnCount();i++){
				System.out.println(meta.getColumnName(i));
			}
			
		} catch (Exception e) {
		} finally{
			DBUtils.closeConnection(conn);
		}
	}
}
