package tw.ottozong.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Repository;

import tw.ottozong.spring.bean.Uid;
import tw.ottozong.spring.util.DBUtils;

//聲明: uidDao
@Repository("uidDao")
public class UidDaoImpl implements IUidDao {

	@Resource(name = "dataSource")
	private BasicDataSource dataSource;

	public Integer insert_list(Uid uid) {
		// 1.聲明必要的變量
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO u_todolist " 
					+ " (id , username, list, todo) " 
					+ " VALUES " 
					+ " (?, ?, ?, ?)";

		Integer id = -1;

		try {
			// 2.獲取連結.
			conn = dataSource.getConnection();
			// 3.預編譯SQL.
			pstmt = conn.prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, uid.getId());
			pstmt.setString(2, uid.getUsername());
			pstmt.setString(3, uid.getTodo());
			pstmt.setString(4, uid.getList());
			// 4.執行,如果可以獲取返回值，則獲取.
			pstmt.executeUpdate();
			// 5.處理結果,通常是因為執行select或insert.
			rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// TODO 6.釋放資源.
			DBUtils.close(conn, pstmt, rs);
		}

		return id;

	}

	

	public Uid findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Uid delData(Uid uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
