package com_xworkz_javaa.polymorphism;

public class HumanTest {
public static void main(String[] args) {
	Human shruthi = new Human();
	Unknown unknown = new Unknown();
	Friend friend = new Friend();
	shruthi.speak(unknown);
	shruthi.speak(friend);
	
}
}
