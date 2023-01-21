package com_xworkz_javaa.polymorphism;

public class Human {

	void speak(Unknown person) {
		
		System.out.println("HI");
		
	}
	void speak(Friend person) {
		System.out.println("HI...Bla....Bla...");
		
	}
}
