package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import include.Product;

public class Model extends Conn {

	public boolean create_list(Product p) {
		PreparedStatement pst = null;
		boolean flag = false;

		String sql = "INSERT INTO u_todolist " 
				+ " (id , username, list, todo) " 
				+ " VALUES " 
				+ " (?, ?, ?, ?)";
		
		try {
			
			pst = getConnection().prepareStatement(sql);
			pst.setInt(1, p.getId());
			pst.setString(2, p.getUsername());
			pst.setString(3, p.getTodo());
			pst.setString(4, p.getList());

			if (pst.executeUpdate() == 1) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (getConnection() != null)
					getConnection().close();

				if (pst != null)
					pst.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;

	}

	@Test
	public void testInsert() {
		Model pro = new Model();
		pro.create_list(new Product());
	}
}
