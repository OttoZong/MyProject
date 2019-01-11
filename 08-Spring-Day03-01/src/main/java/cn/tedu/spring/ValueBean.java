package cn.tedu.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ValueBean {
	
	private List<String> provinces;
	private Set<String> cities;
	private Map<String,String> session;
	private Properties dbConfig;
	
	
	public List<String> getProvinces() {
		return provinces;
	}
	
	public void setProvinces(List<String> provinces) {
		this.provinces = provinces;
	}
	
	public Set<String> getCities() {
		return cities;
	}
	
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	
	public Map<String, String> getSession() {
		return session;
	}
	
	public void setSession(Map<String, String> session) {
		this.session = session;
	}
	
	public Properties getDbConfig() {
		return dbConfig;
	}
	
	public void setDbConfig(Properties dbConfig) {
		this.dbConfig = dbConfig;
	}
	
	
	
	@Override
	public String toString() {
		return "ValueBean [\n\n"
				+ "provinces=" + provinces + ",\n\n "
				+ "cities=" + cities + ",\n\n "
				+ "session=" + session + ",\n\n "
				+ "dbConfig="+ dbConfig + ",\n\n "
				+ "]";
	}
	
	
	
}
