package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestDemo6 {
	private static final String PrepareStatement = null;

	public static void main(String[] args) {
		Connection conn = null;
		//準備一批sql語句.
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
//			//把一批sql語句加載到sta的緩存中.
//			sta.addBatch(sql1);
//			sta.addBatch(sql2);
//			sta.addBatch(sql3);
//			sta.addBatch(sql4);
//			sta.addBatch(sql5);
//			int[] arr = sta.executeBatch();
//			for(int i= 0;i<arr.length;i++){
//				System.out.println(arr[i]);
//			}
			//返回值>=0,說明成功.
			//-2 成功但是沒結果.
			//-3 執行失敗.
			
			//加載一批參數,一次執行.
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
