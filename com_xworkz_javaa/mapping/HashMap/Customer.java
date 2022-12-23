package com_xworkz_javaa.mapping.HashMap;

public class Customer {

private String name;
private String id;
private String loc;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", id=" + id + ", loc=" + loc + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}


	
}
