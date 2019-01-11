/*
* Copyright (c) 1994, 2018, lccnet and/or  偷我程式者，將受到神的制裁
*/

package tw.com.lccnet.factory;

import tw.com.lccnet.dao.CustomerDao;
import tw.com.lccnet.dao.CustomerDaoImpl;

/**
*	專案名稱:JDBC
* 	建立時間:2018年10月18日 下午9:11:18
*	@auther EricYang
*	Email:eric.tw.2015@gmail.com
*	@version 1.0V
* 
*	TODO
*/

public class CustomerFactory {
	//CustomerDao  xxx=new CustomerDaoImpl();
	public static CustomerDao getFactory() {
		return new CustomerDaoImpl();
	}

}
