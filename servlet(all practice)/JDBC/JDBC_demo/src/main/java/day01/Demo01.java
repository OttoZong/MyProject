package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
	
	public static void main(String[] args) throws SQLException {
		//1.���U�X��
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���U����");
		}
		System.out.println("���U���\!!");
		//2.����ƾڮw�s����H
		//url	jdbc:mysql://�ƾڮw�D��IP:�ݤf��/demo1

		String url="jdbc:mysql://localhost:3306/demo1";
		String user="root";	//mysql�n�J�W
		String password="root";//�n�J�K�X
		Connection conn = DriverManager.getConnection(url,user,password);
		System.out.println(conn);
		
			//�bmysql�׺ݺV�Fuse demo
			//�s�gsql�y�y,�åB����
		//3.���statement��H--����sql�y�y
		Statement sta= conn.createStatement();
		System.out.println(sta);
		//4.����sql�y�y
		String ddl = "create tablet1(id int" + ",name varchar(10)";
//		boolean flag = sta.execute(ddl);
//		System.out.println(flag);
		//execut(sql) ddl dml dql dcl tcl
		//executUpdate(dml)
		//executQuery(dql)
		String sql1="insert into t1" + "value(1,'�i�T')";
//		boolean flag = sta.execute(sql1);
		int n = sta.executeUpdate(sql1);
		System.out.println(n);
		//�d��
		ResultSet rs = sta.executeQuery("select * from t1");
//		while(rs.next()){
//			//�n���D�w���C�W,�M�ƾ�����
//			//�ѼƬ��C�W,��k����������ƾ�������get��k
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			System.out.println("id=" + id +",name="+name);
//		}
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println(id+"-----"+name);
			
		}
		
	}
}
