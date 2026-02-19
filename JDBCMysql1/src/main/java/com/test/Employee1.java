package com.test;

public class Employee1 {
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", cmp=" + cmp + ", city=" + city + "]";
	}
	private int id;
	private String name;
	private String cmp;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
