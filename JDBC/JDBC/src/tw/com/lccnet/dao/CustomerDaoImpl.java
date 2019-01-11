/*
* Copyright (c) 1994, 2018, lccnet and/or  偷我程式者，將受到神的制裁
*/

package tw.com.lccnet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import tw.com.lccnet.bean.Customer;
import tw.com.lccnet.db.DBManager;

/**
*	專案名稱:JDBC
* 	建立時間:2018年10月18日 下午9:10:38
*	@auther EricYang
*	Email:eric.tw.2015@gmail.com
*	@version 1.0V
* 
*	TODO
*/

public class CustomerDaoImpl implements CustomerDao {
	//有開有關，先開後關
	@Override
	public void addCustomer(Customer cus) {
		Connection conn=DBManager.getConn().getConnection();
		String sql="insert into customer(name,age,email.address)"
				+ "values(?,?,?,?);";
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, cus.getName());
			ps.setString(2, cus.getAge());
			ps.setString(3, cus.getEmail());
			ps.setString(4, cus.getAddress());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.getConn().close(ps);
			DBManager.getConn().close(conn);;
		}
	}

	@Override
	public List<Customer> findByName(String name) {

		return null;
	}

}
