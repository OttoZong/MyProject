package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo5 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
//			conn = DBUtils3.getConnection();
//			Statement sta = conn.createStatement();
//			String sql="create table t11(" 
//					+ "id int,name varchar(10)," 
//					+ "age int)";
//			sta.execute(sql);
			
//			conn = DBUtils3.getConnection();
//			String sql = "insert into t11 values(?,?,?)";
//			//�w�sĶ�y�y
//			PreparedStatement ps = conn.prepareStatement(sql);
//			/*
//			 * �Nsql�y�y�e��ƾڮw,�óЫذ���p�e
//			 * ���Ӷ��ǩM�ƶq�o�e�Ѽ�
//			 * ��ps�ݰ��S�����檺����p�e
//			 * �q�Lps��H�����p�e�����Ѽƶ�W
//			 */
//			ps.setInt(1, 1);
//			ps.setString(2, "lucy");
//			ps.setInt(3, 18);
//			int n = ps.executeUpdate();
//			System.out.println(n);
//			ps.setString(2, "lily");
//			ps.setInt(3, 20);
//			n = ps.executeUpdate();
//			System.out.println(n);
			
			conn = DBUtils3.getConnection();
			String sql = "select * from t11 where name like ?";
			//�Nsql�y�y�o�e��ƾڮw,�Ыذ���p�e.
			PreparedStatement ps = conn.prepareStatement(sql);
			//���Ӷ��ǵ�ps(����p�e)��H�K�[�Ѽ�.
			ps.setString(1, "L%");
			//����p�e
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String str= rs.getString(2);
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBUtils3.closeConnection(conn);
		}

	}
}
