package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import include.Product;

public class ModelProducts extends Connexion{
	
	public boolean create_Product(Product p){
		PreparedStatement pst=null;
		boolean flag = false;
		
		String sql="call insertProducto(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pst=getConnection().prepareStatement(sql);
			pst.setString(1, p.getNombre());
			pst.setString(2, p.getDescripcion());
			pst.setFloat(3, p.getPrecio());
			pst.setString(4, p.getCategoria());
			pst.setString(5, p.getDetalles());
			pst.setString(6, p.getRevuews());
			pst.setInt(7, p.getSize());
			pst.setString(8, p.getColor());
			pst.setString(9, p.getImages_1());
			pst.setString(10, p.getImages_2());
			pst.setString(11, p.getImages_3());
			pst.setString(12, p.getImages_4());
			pst.setString(13, p.getImages_5());
			
			if(pst.executeUpdate()==1){
				flag=true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(getConnection() !=null) getConnection().close();
					
				if(pst != null) pst.close();
									
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	
	@Test
	public void testInsert(){
		ModelProducts ps4Pro = new ModelProducts();
		ps4Pro.create_Product(new Product());
	}
}
