package com_xworkz_javaa.polymorphism.methodOveriding;

public class MethodOveridingDemo {

	public static void main(String[] args) {
	RBI rbi = new RBI();
	SBI sbi = new SBI();
	HDFC hdfc = new HDFC();
	
	System.out.println(rbi.getinterestrate());
	System.out.println(sbi.getinterestrate());
	System.out.println(hdfc.getinterestrate());
	
	}
}
