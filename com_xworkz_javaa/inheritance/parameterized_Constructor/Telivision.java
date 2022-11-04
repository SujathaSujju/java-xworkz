package com_xworkz_javaa.inheritance.parameterized_Constructor;

public class Telivision {
    String brand;
    double price;
    
    public Telivision() {
    	System.out.println("I am a default constructor");
    	
    }
    Telivision(String brand1,double price1){
    	System.out.println("I am a parameterized constructor");
    	brand = brand1;
    	price = price1;
    }
}
