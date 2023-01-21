package xworkz_myprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values");
		double n= scan.nextDouble();
		
		if(n%2==0) {
			System.out.println(n+"is even number");
		}
		else if(n%2==1)
		{
			System.out.println("is odd number");
		}
		
		else
		{
			System.out.println("invalid number");
		}
		
	}

}
}