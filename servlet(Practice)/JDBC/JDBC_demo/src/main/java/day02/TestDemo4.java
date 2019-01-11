package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo4 {
	public static void main(String[] args) {
		Thread t1 = new DemoThread(500, "線程1");
		Thread t2 = new DemoThread(500, "線程2");
		Thread t3 = new DemoThread(500, "線程3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class DemoThread extends Thread {
	int wait;// 睡眠時間
	String conn_name;
	public DemoThread(int wait,String conn_name) {
		this.wait = wait;
		this.conn_name = conn_name;
	}
	@Override
	public void run() {
		Connection conn=null;
		try {
			//conn適從連接池中得到的.
			conn=DBUtils3.getConnection();
			System.out.println(conn_name+"獲取連接"+"---"+conn);
			Statement sta = conn.createStatement();
			String sql="select 'hello' from dual";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				System.out.println(1);
			}
			Thread.sleep(wait);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils3.closeConnection(conn);
		}
		
	}
}