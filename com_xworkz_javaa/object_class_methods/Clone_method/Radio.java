package com_xworkz_javaa.object_class_methods.Clone_method;

public class Radio implements Cloneable{
	String Brand;
	double price;
	Battery battery;
	
	public Radio(String Brand,double price, Battery battery) {
		this.Brand = Brand;
		this.price = price;
		this.battery = battery;
		
	}

	public Radio clone() throws CloneNotSupportedException{
		Radio duplicate = (Radio)super.clone();
		duplicate.battery = new Battery("everyday");
		return duplicate;
	}

	@Override
	public String toString() {
		return "Radio [Brand=" + Brand + ", price=" + price + ", battery=" + battery + "]";
	}
	
	}
