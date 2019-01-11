package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pojo.Number;
import db.DBConnection;

public class implnumber {
	
	
	
	public void saveName(Number number){
		Connection conn=null;
		PreparedStatement ps=null;
		conn=DBConnection.getMyConnection().getConnection();
		String savesql="insert into number(naccess,nemail.npassword,nlike)values(?,?,?,?);";
		try{
			ps=conn.prepareStatement(savesql);
			ps.setString(1, number.getNaccess());
			ps.setString(2, number.getNemail());
			ps.setString(3, number.getNpassword());
			ps.setString(4, number.getNaccess());
			ps.setString(5, number.getNaccess());
			
		} catch (SQLException e){
			e.printStackTrace();
		}finally{
			DBConnection.getMyConnection().close(ps);
			DBConnection.getMyConnection().close(conn);
		}
		
	}

}
