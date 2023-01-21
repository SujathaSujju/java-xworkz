package com_xworkz_javaa.Exception.Unchecked_Exception;

public class Customer {

	public static void main(String[] args) {
		
		Dmart dmart = new Dmart();
		
		try {
			dmart.search(new Product("soap",10.00));
		}
		catch(DmartException e) {
			System.out.println(e);
		}
	}
}
