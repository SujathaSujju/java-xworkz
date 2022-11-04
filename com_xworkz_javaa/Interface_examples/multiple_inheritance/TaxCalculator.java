package com_xworkz_javaa.Interface_examples.multiple_inheritance;

public class TaxCalculator implements StateTax,CentralTax {
  
	public void incomeTax() {
		System.out.println("income tax is 100 Rs");
		
	}
	
	public void electricityTax() {
		System.out.println("electricity tax is 50 Rs");
		
	}
}
