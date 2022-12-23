package com_xworkz_javaa.Exception.Checked_Exception;

public class ATMException extends Exception {

	@Override
	public String toString() {
		return "invalid amount entered..";
	}

	@Override
	public String getMessage() {
		return "you are crossing a limit..";
	}
	
 
}
