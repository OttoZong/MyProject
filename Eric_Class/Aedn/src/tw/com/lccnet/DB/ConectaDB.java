package tw.com.lccnet.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaDB {
	private final String database;
	private String message;
		
		public ConectaDB(){
			this.database="Aedn";
		}
		public ConectaDB(String database){
			this.database=database;
		}
		
		public Connection getConnection(){
			Connection cn=null;
			
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","123456");
			}catch(ClassNotFoundException|InstantiationException|IllegalAccessException | SQLException e){
				setMessage(e.getMessage());
			}
			return cn;
		}
			
		
		public String getMessage(){
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
}
