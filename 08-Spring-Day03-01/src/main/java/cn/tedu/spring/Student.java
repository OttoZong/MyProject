package cn.tedu.spring;

import java.util.Set;

public class Student {
	private String uid;
	private String name;
	private String province;
	private Set<String> cities;
	private String jdbcUrl;
	private String jdbcDriver;
	
	
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Student [\n"
			+ "uid=" + uid + "\n"
			+ "name=" + name + "\n"
			+ "province=" + province + "\n"
			+ "cities=" + cities + "\n"	
			+ "jdbcUrl=" + jdbcUrl + "\n"
			+ "jdbcDriver=" + jdbcDriver + "\n"
			+ "]";
	}

	public Set<String> getCities() {
		return cities;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	
	
	
}
