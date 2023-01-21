package com_xworkz_javaa.Exception.Checked_Exception;

public class Sujatha {
  public static void main(String[] args) {
	  int amount = 600000;
	  ATMMachine ate = new ATMMachine();
	  	  
  try {
	  ate.draw(amount);
  }
  catch(ATMException e) {
	  if(amount%100!=0) {
		  System.out.println(e);
	  }
	  else {
		  System.out.println(e.getMessage());
		  
	  }
  }
}
}
