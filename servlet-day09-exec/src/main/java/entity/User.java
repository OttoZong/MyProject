package entity;
/**
 * 實體類:
 * 	與表的結構一致,用於存放從數據庫中查詢出來的紀錄.
 * @author Otto
 *
 */
public class User {
	private int id;
	private String username;
	private String pwd;
	private String phone;
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id 
				+ ", username=" + username 
				+ ", pwd=" + pwd + ", phone=" 
				+ phone + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
