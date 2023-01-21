package xworkz_myprograms;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		while(true) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values");
		int n= scan.nextInt();
		
		if(n>0)
		{
			System.out.println(n+ "is positive number");
		}
		if(n<0)
		{
			System.out.println(n+ "is negative number");
		}
		else
		{
			System.out.println("zero");
		}
		
	}

}
}