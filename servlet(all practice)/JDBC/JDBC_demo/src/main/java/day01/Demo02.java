package day01;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Demo02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		//1.把mysql-jdbc導入
		try {
		//2.註冊驅動
			Class.forName("com.mysql.jdbc.Driver");
		//3.獲取連接對象
			conn = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo","root","root");
			
//			System.out.println(conn);
		//4.通過conn獲得statement對象
			Statement sta = conn.createStatement();
		//5.執行sql語句
			//execute(ddl)dcl
			//executeUpdate(dml)
			//返回值 int n = executeUpdate(dml)
			ResultSet rs = sta.executeQuery("select * from t1");
			while(rs.next()){
				int id = rs.getInt(1);//可以使用字段下標,從1開始.
				String name = rs.getString("name");//可以使用列名.
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
		//為了嚴謹性關上.
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
