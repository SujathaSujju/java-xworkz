package com_xworkz_javaa.Exception.Checked_Exception;

public class ATMMachine {
  
	void draw(int amount) throws ATMException{
		if(amount%100!=0 || amount>50000) {
			ATMException atm = new ATMException();
			throw atm;
		}
		else {
			System.out.println("collect cashh...");
		}
	}
}
