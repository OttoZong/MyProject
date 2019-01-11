package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDemo8 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//�D��۰ʼW�����C�W.
			String[] cols ={"id"};
			String sql="insert into keyword values"+ "(null,?)";
			conn = DBUtils.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql,cols);
			ps.setString(1, "�Ѯ�");
			ps.executeUpdate();//���Jkeyswords�@���ƾ�
			

			ResultSet rs = ps.getGeneratedKeys();
			int id = 0;
			while(rs.next()){
				id=rs.getInt(1);
				System.out.println(id);
			}
			rs.close();
			ps.close();
			String sql1="insertinto post values(null,?,?)";
			ps = conn.prepareStatement(sql1);
			ps.setString(1, "���ѤѮ𤣦n");
			ps.setInt(2, id);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeConnection(conn);
		}
	}
}
