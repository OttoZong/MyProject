package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
	
	public static void main(String[] args) throws SQLException {
		//1.註冊驅動
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("註冊失敗");
		}
		System.out.println("註冊成功!!");
		//2.獲取數據庫連結對象
		//url	jdbc:mysql://數據庫主機IP:端口號/demo1

		String url="jdbc:mysql://localhost:3306/demo1";
		String user="root";	//mysql登入名
		String password="root";//登入密碼
		Connection conn = DriverManager.getConnection(url,user,password);
		System.out.println(conn);
		
			//在mysql終端敲了use demo
			//編寫sql語句,並且執行
		//3.獲取statement對象--執行sql語句
		Statement sta= conn.createStatement();
		System.out.println(sta);
		//4.執行sql語句
		String ddl = "create tablet1(id int" + ",name varchar(10)";
//		boolean flag = sta.execute(ddl);
//		System.out.println(flag);
		//execut(sql) ddl dml dql dcl tcl
		//executUpdate(dml)
		//executQuery(dql)
		String sql1="insert into t1" + "value(1,'張三')";
//		boolean flag = sta.execute(sql1);
		int n = sta.executeUpdate(sql1);
		System.out.println(n);
		//查詢
		ResultSet rs = sta.executeQuery("select * from t1");
//		while(rs.next()){
//			//要知道庫中列名,和數據類型
//			//參數為列名,方法為獲取相應數據類型的get方法
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
