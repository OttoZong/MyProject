package tw.com.lccnet.service;

import java.util.List;

import tw.com.lccnet.dct.Contactos;

public interface ServiceContactos {
	public List<Contactos> contactosQry();
	
	public void contactosIns(Contactos contactos);
	
	public Contactos contactosFind(Integer id);
	
	public void contactosUpd(Contactos contactos);	
	public void contactosDel(Integer id);
	public String getMensaje();
}
