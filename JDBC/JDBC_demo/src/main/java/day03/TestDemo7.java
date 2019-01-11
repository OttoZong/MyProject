package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

/**
 * 批量更新.
 * 防止內存溢出.
 * @author Otto
 *
 */
public class TestDemo7 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn=DBUtils.getConnection();
			String sql = "insert into account values (?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i = 1 ;i<20;i++){
				ps.setInt(i, i+1000);
				ps.setDouble(2, 10000);
				ps.addBatch();
				if(i%8==0){
					int[] arr = ps.executeBatch();
					System.out.println(Arrays.toString(arr));
					ps.clearBatch();//清除緩存.
				}
			}
			//執行最後一批不夠數的.
			ps.executeBatch();
		} catch (Exception e) {
		}finally{
			DBUtils.closeConnection(conn);
		}	
	}
}
