package com_xworkz_javaa.inheritance.Constructor_Chaining;

public class Watch {

	String name;
	double price;
	String color;
	String type;
	 
	Watch(){
		this("fast track",2000.100);
		System.out.println("I am a Default Constructor");
		
	}
	Watch(String name,double price){
		this(name,price,null,null);
		System.out.println("I am a 2 parameterized constructor");
		this.name = name;
		this.price = price;
		
	}
	Watch(String name,double price,String color,String type){
		System.out.println("I am a 4 parameterized constructor");
		this.name = name;
		this.price = price;
		this.color = color;
		this.type = type;
		
	}
}
