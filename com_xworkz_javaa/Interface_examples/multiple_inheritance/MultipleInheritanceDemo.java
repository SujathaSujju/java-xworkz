package com_xworkz_javaa.Interface_examples.multiple_inheritance;
public class MultipleInheritanceDemo {
 
	public static void main(String[] args) {
		
		TaxCalculator taxcalculator = new TaxCalculator();
		
		taxcalculator.electricityTax();
		taxcalculator.incomeTax();
	}
}
