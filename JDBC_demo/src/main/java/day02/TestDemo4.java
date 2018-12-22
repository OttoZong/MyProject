package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo4 {
	public static void main(String[] args) {
		Thread t1 = new DemoThread(500, "�u�{1");
		Thread t2 = new DemoThread(500, "�u�{2");
		Thread t3 = new DemoThread(500, "�u�{3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class DemoThread extends Thread {
	int wait;// �ίv�ɶ�
	String conn_name;
	public DemoThread(int wait,String conn_name) {
		this.wait = wait;
		this.conn_name = conn_name;
	}
	@Override
	public void run() {
		Connection conn=null;
		try {
			//conn�A�q�s�������o�쪺.
			conn=DBUtils3.getConnection();
			System.out.println(conn_name+"����s��"+"---"+conn);
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