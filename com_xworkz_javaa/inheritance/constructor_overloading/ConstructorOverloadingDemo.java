package com_xworkz_javaa.inheritance.constructor_overloading;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		
		Medicine medicine = new Medicine();
		System.out.println(medicine.name);
		Medicine paracetamol = new Medicine("paracetamol",10.00);
		System.out.println(paracetamol.name);
		
		}
}
