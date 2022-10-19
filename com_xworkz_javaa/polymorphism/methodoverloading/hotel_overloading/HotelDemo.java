package com_xworkz_javaa.polymorphism.methodoverloading.hotel_overloading;

public class HotelDemo {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		ACroom acroom = new ACroom();
		NonACroom nonacroom = new NonACroom();
		
		hotel.Room(acroom);
		hotel.Room(nonacroom);
	}
}
