package com_xworkz_javaa.object_class_methods.Finalize_method;

public class FinalizeTest {
 
	public static void main(String[] args) {
		
		Marker marker = new Marker("camlin");
		marker=null;
		System.gc();
		System.out.println(marker);
	}
}
