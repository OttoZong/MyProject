package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestDemo4 {

	public static void main(String[] args) {
		/**
		 * 1.對比statement和preparedstatement的效率
		 * 2.開啟自動提交和關閉自動提交的效率
		 */
		Connection conn = null;
		try {
			conn = DBUtils.getConnection();
			long begin=System.currentTimeMillis();			
//			Statement sta = conn.createStatement();
//			for (int i =0; i< args.length;i++){
//				String sql = "insert into t11 values" 
//						+ "("+ i +"'name"+i+"',"+i+")";
//				sta.executeQuery(sql);
//			}
			//preparedstatement
			conn.setAutoCommit(false);
			String sql = "insert into t11 values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i = 0;i<500;i++){
				ps.setInt(1, i);
				ps.setString(2, "name"+i);
				ps.setInt(3, i);
				ps.executeUpdate();
			}
			conn.commit();
			long end = System.currentTimeMillis();
			System.out.println("耗時:"+(end-begin));
			
		} catch (Exception e) {
			
		} finally{
			DBUtils.closeConnection(conn);
		}
	}
}
