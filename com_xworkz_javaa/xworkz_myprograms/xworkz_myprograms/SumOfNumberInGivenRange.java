package xworkz_myprograms;

import java.util.Scanner;

public class SumOfNumberInGivenRange {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values for a");
		int a= scan.nextInt();
		System.out.println("enter the values for b");
		int b= scan.nextInt();
		
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum:"+sum);
		
	

	}

}
