package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/**
 * 模擬用戶登錄帳號密碼
 */

public class TestDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入用戶名");
		String user = sc.nextLine();
		System.out.println("請輸入密碼");
		String pwd = sc.nextLine();
		boolean falg = login(user, pwd);
		if(falg){
			System.out.println("登入成功,頁面跳轉");
		} else {
			System.out.println("登入失敗");
		}
	}
	public static boolean login(String user,String pwd){
		Connection conn = null;
		try {
			conn = DBUtils3.getConnection();
			String sql = "select count(*) from t11 where name=? and name=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			
			
//			Statement sta = conn.createStatement();
//			String sql = 
//			"select count(*) as c from t11 where" 
//			+ "name = '"+ user +"' and name='"+ pwd +"'";
//			
//			System.out.println(sql);
//			ResultSet rs = sta.executeQuery(sql);
//			while(rs.next()){
//				int n =rs.getInt(1);
//				return n>=1;
//			}
			
		} catch (Exception e) {
			
		}finally{
			DBUtils3.closeConnection(conn);
		}
		return false;
		
	}
}
