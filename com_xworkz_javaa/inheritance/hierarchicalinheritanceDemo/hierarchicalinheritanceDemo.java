package com_xworkz_javaa.inheritance.hierarchicalinheritanceDemo;

public class hierarchicalinheritanceDemo {
	
	public static void main(String[] args) {
		
		bike Bike = new bike();
		car Car = new car();
		truck Truck = new truck();
		
		Bike.speed();
		Bike.wheeling();
		
		Car.speed();
		Car.dragrace();
		
		Truck.speed();
		Truck.carryload();
		
	}

}
