/*
* Copyright (c) 1994, 2018, lccnet and/or  偷我程式者，將受到神的制裁
*/

package tw.com.lccnet.view;

import java.sql.Connection;

import tw.com.lccnet.db.DBManager;

/**
*	專案名稱:JDBC
* 	建立時間:2018年10月18日 下午9:50:37
*	@auther EricYang
*	Email:eric.tw.2015@gmail.com
*	@version 1.0V
* 
*	TODO
*/

public class MainTest {

	public static void main(String[] args) {
		Connection dd=DBManager.getConn().getConnection();
		System.out.println(dd);
	}	

}
