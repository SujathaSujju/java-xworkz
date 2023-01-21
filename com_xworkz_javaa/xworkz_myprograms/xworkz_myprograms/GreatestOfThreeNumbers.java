package xworkz_myprograms;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
while(true)
{

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values for a");
		int a = scan.nextInt();
		System.out.println("enter the values for b");
		int b = scan.nextInt();
		System.out.println("enter the values for c");
		int c = scan.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("a is gretaer");
			} else {
				System.out.println("c is greater");
			}

		} else if (a<b) {
			if(b>c) {
			System.out.println("b is greater");
		} 
			else  {
			System.out.println(" c is greater ");
		}

			
	}
		else
		{
			System.out.println("invalid ");
		}

}
}
}
