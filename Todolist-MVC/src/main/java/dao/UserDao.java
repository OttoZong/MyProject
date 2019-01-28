package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.idao.Idao;
import model.User;
import util.DBUtils;

public class UserDao implements Idao{
	
	/**
	 * 通過抽象類Ido，實踐findName方法
	 * 
	 * 連結資料庫到Name底下的list和todo
	 * 並存值於lists
	 * 
	 */
	public List<User> findName() {	
		List<User> lists =
				new ArrayList<User>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConnection();
			
			String sql = "SELECT * FROM u_todolist";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				String username = rs.getString("username");
				String list = rs.getString("list");
				String todo = rs.getString("todo");
				
				User user = new User();
				user.setUsername(username);
				user.setList(list);
				user.setTodo(todo);
				
				lists.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			DBUtils.closeConnection(conn);
			
		}
		return lists;
	}
}