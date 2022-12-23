package com_xworkz_javaa.mapping.HashMap;

public class Bank {

	private String name;
	private String loc;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", loc=" + loc + "]";
	}
	
	
	
	
}
