package day01;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Demo02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		//1.��mysql-jdbc�ɤJ
		try {
		//2.���U�X��
			Class.forName("com.mysql.jdbc.Driver");
		//3.����s����H
			conn = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo","root","root");
			
//			System.out.println(conn);
		//4.�q�Lconn��ostatement��H
			Statement sta = conn.createStatement();
		//5.����sql�y�y
			//execute(ddl)dcl
			//executeUpdate(dml)
			//��^�� int n = executeUpdate(dml)
			ResultSet rs = sta.executeQuery("select * from t1");
			while(rs.next()){
				int id = rs.getInt(1);//�i�H�ϥΦr�q�U��,�q1�}�l.
				String name = rs.getString("name");//�i�H�ϥΦC�W.
				System.out.println(id+"----"+name);
			}
		//6.conn.cilse
			rs.close();
			sta.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
		//���F�Y�ԩ����W.
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
