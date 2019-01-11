package web;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBUtils;

public class AddUserServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		/*
		 * 设置对中文参数值使用何种字符集来解码。
		 * 注：
		 * 　　这行代码要添加到request.getParameter
		 * 方法的前面。
		 * 	  只针对post请求有效。
		 */
		request.setCharacterEncoding("utf-8");
		/*
		 * 读取用户信息
		 * 注意，请求参数名不要写错。
		 */
		String uname = 
				request.getParameter("uname");
		String pwd = 
				request.getParameter("pwd");
		String phone = 
				request.getParameter("phone");
		
		System.out.println("uname:" + uname 
				+ " pwd:"  + pwd + " phone:" + phone);
		/*
		 * 设置服务器返回数据的MIMI类型。
		 * (即服务器告诉浏览器，
		 * 服务器返回的数据类型是什么)。
		 * 服务器可以通过content-type消息头
		 * 将数据类型及编码发送给浏览器。
		 */
		response.setContentType(
				"text/html;charset=utf-8");
		PrintWriter out = 
				response.getWriter();
		/*
		 * 將用戶信息插入到數據庫.
		 */
		Connection conn = null;
		try {
			conn = DBUtils.getConnection();
			String sql ="INSERT INTO " 
					+ "t_user(username,pwd,phone)" 
					+ "VALUES(?,?,?)";
			PreparedStatement ps = 
					conn.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ps.setString(3, phone);
			ps.executeUpdate();
			out.print("添加用戶成功");
			
		} catch (SQLException e) {
			/*
			 * 發生異常之後,首先記日志(保留現場).
			 */
			e.printStackTrace();
			/*
			 * 看異常能否恢復. 如果不能夠恢復
			 * (比如, 由於數據庫服務停止,這樣產生的異常等等,稱之為系統異常.),
			 * 則提示用戶稍後重試.
			 */
			out.println("系統繁忙,稍後重試");
		}finally{
			DBUtils.closeConnection(conn);
		}
	}
}