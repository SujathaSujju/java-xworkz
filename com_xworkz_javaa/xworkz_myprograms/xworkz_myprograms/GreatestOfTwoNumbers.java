package xworkz_myprograms;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
       while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values for a");
		int a= scan.nextInt();
		System.out.println("enter the values for b");
		int b= scan.nextInt();
		
		if(a>b)
		{
			System.out.println(a+"is greater");
		}
		else if(a<b)
		{
			System.out.println(b+"is greater");
		}
		else
		{
			System.out.println("a:"+a+" "+"and"+" "+"b:"+b+" are equal");
		}
	}

}
}
