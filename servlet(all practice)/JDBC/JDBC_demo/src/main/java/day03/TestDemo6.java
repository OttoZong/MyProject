package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestDemo6 {
	private static final String PrepareStatement = null;

	public static void main(String[] args) {
		Connection conn = null;
		//�ǳƤ@��sql�y�y.
		String sql1="insert into account values(" 
				+ "100,5000)";
		String sql2="insert into account values(" 
				+ "100,5000)";
		String sql3="insert into account values(" 
				+ "100,5000)";
		String sql4="insert into account values(" 
				+ "100,5000)";
		String sql5="insert into account values(" 
				+ "100,5000)";
		String sql6="insert into account values(" 
				+ "100,5000)";
		String sql7="insert into account values(" 
				+ "100,5000)";
		String sql8="insert into account values(" 
				+ "100,5000)";
		try {
//			conn=DBUtils.getConnection();
//			Statement sta = conn.createStatement();
//			//��@��sql�y�y�[����sta���w�s��.
//			sta.addBatch(sql1);
//			sta.addBatch(sql2);
//			sta.addBatch(sql3);
//			sta.addBatch(sql4);
//			sta.addBatch(sql5);
//			int[] arr = sta.executeBatch();
//			for(int i= 0;i<arr.length;i++){
//				System.out.println(arr[i]);
//			}
			//��^��>=0,�������\.
			//-2 ���\���O�S���G.
			//-3 ���楢��.
			
			//�[���@��Ѽ�,�@������.
			String sql = "insert into account values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 100);
			ps.setDouble(2, 1000);
			ps.addBatch();
			ps.setInt(1, 100);
			ps.setDouble(2, 1000);
			ps.addBatch();
			ps.setInt(1, 100);
			ps.setDouble(2, 1000);
			ps.addBatch();
			
			int[] arr = ps.executeBatch();
			for(int i = 0; i<arr.length;i++){
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
		}finally{
			DBUtils.closeConnection(conn);
		}
	}
}
