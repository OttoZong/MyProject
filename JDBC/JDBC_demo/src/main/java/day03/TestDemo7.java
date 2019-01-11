package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

/**
 * ��q��s.
 * ����s���X.
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
					ps.clearBatch();//�M���w�s.
				}
			}
			//����̫�@�夣���ƪ�.
			ps.executeBatch();
		} catch (Exception e) {
		}finally{
			DBUtils.closeConnection(conn);
		}	
	}
}
