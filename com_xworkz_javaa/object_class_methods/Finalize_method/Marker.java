package com_xworkz_javaa.object_class_methods.Finalize_method;

public class Marker {
  String brand;
  
   public Marker(String brand) {
	   this.brand=brand;
   }

@Override
public void finalize() throws Throwable {
	System.out.println("Finalize method executed.");
}

@Override
public String toString() {
	return "Marker [brand=" + brand + "]";
}
   
}
