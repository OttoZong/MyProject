package tw.com.lccnet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import tw.com.lccnet.DB.ConectaDB;
import tw.com.lccnet.dct.Contactos;
import tw.com.lccnet.service.ServiceContactos;

public class ServiceContactosImpl implements ServiceContactos{
	private final ConectaDB db;
	private String Mensaje;
	
	public ServiceContactosImpl(ConectaDB db, String mensaje) {
		this.db = new ConectaDB();
		
	}

	@Override
	public List<Contactos> contactosQry() {
		List<Contactos> lista=null;
		String sql="select id,nombres,celular,corred from contactos";
		Connection cn = db.getConnection();
		
		if(cn!=null){
			try {
				PreparedStatement ps = cn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				lista = new LinkedList<>();
				while(rs.next()){
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public void contactosIns(Contactos contactos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contactos contactosFind(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void contactosUpd(Contactos contactos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contactosDel(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMensaje() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
