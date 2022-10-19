package com_xworkz_javaa.polymorphism.methodoverloading.hotel_overloading;

public class Hotel {

	void Room(ACroom person) {
		System.out.println("The person will get sleep comfortably");
	}
	void Room(NonACroom person) {
		System.out.println("The person will get sleep normally");
	}
}
