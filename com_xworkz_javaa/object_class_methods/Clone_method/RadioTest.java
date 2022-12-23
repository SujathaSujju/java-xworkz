package com_xworkz_javaa.object_class_methods.Clone_method;

public class RadioTest {

	public static void main(String[] args) {
		
		Radio sony = new Radio("sony",10000.00, null);
		try {
			Radio copyOfSony = (Radio)sony.clone();
			System.out.println("details of sony: "+sony);
			System.out.println("details of CopyOfSony: "+copyOfSony);
			copyOfSony.price = 20000.00;
			sony.price = 30000.00;
			System.out.println("After a change:----------");
			System.out.println("details of sony:" +sony);
			System.out.println("details of CopyOfSony: "+copyOfSony);
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
