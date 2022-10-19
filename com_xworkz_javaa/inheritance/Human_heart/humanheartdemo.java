package com_xworkz_javaa.inheritance.Human_heart;

public class humanheartdemo {
	public static void main(String[] args) {
		
		human human = new human();
		
		human.Bodyparts = "Heart";
		human.Temperature = 35;
	    human.heart = new heart();
		
		System.out.println("human main body part is "+human.Bodyparts);
			
		System.out.println("Normal Human Body Temperature is "+human.Temperature);
		
		System.out.println("Human HeartBeat is "+human.heart.heartbeat);
		
		System.out.println("Normal Human bloodpumps per minute is "+human.heart.bloodpump);
	}
	
	

}
