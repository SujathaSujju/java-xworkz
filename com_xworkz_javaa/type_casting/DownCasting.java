package com_xworkz_javaa.type_casting;

public class DownCasting {
  
	public static void main(String[] args) {
		
		Tree tree = new Mango();
		Mango mango = (Mango) tree;
		
		mango.provideOxygen();
		mango.providesMangoFruits();
	}
}
