package com_xworkz_javaa.inheritance.parameterized_Constructor;

public class ParameterizedConstructor {
  public static void main(String[] args) {
	  
	  Telivision tcl = new Telivision("TCL",5000.100);
	  System.out.println(tcl.brand);
	  
	  Telivision sony = new Telivision("sony",10000.100);
	  System.out.println(sony.brand);
	  
	  Telivision tv = new Telivision();
	  System.out.println(tv.brand);
  }
}
