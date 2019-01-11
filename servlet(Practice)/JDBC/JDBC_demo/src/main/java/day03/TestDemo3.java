package day03;

import java.sql.Connection;
import java.sql.Statement;

public class TestDemo3 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DBUtils.getConnection();
			//關閉自動提交.
			conn.setAutoCommit(false);
			//sql---dml
			Statement sta = conn.createStatement();
			String sql1="insert into t11 values"
						+"(1,'jerry',20)";
			String sql2="insert into t11 values"
						+"(2,'tom',30,15)";
			String sql3="insert into t11 values"
						+"(3,'小強',4)";
			sta.executeQuery(sql1);
			sta.executeQuery(sql2);
			sta.executeQuery(sql3);
			//手動提交.
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			DBUtils.rollBack(conn);
		} finally {
			DBUtils.closeConnection(conn);
		}
	}
}
