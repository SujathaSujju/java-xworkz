package xworkz_myprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("enter the value");
		while (true) {
			int number=a.nextInt();
			if (number > 0 && number < 26) {
				int result = 1;

				for (number = 1; number <= 10; number++) {

					result = number * result;
				}

				System.out.println(result);
			} else {
				System.out.println("entered number " + number + " is not valid please enter from 1 to 26");
			}
		}

	}
}
