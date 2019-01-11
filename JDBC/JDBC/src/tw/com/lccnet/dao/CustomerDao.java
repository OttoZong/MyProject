/*
* Copyright (c) 1994, 2018, lccnet and/or  偷我程式者，將受到神的制裁
*/

package tw.com.lccnet.dao;

import java.util.List;

import tw.com.lccnet.bean.Customer;

/**
*	專案名稱:JDBC
* 	建立時間:2018年10月18日 下午8:56:04
*	@auther EricYang
*	Email:eric.tw.2015@gmail.com
*	@version 1.0V
* 
*	TODO
*/

public interface CustomerDao {

	public void addCustomer(Customer cus);
	
	public List<Customer> findByName(String name);
	
	
}
