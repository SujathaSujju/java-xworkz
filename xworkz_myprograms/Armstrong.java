package xworkz_myprograms;

import java.util.Scanner;

public class Armstrong{
	
	public static void main(String[] args){
			
				Scanner A=new Scanner(System.in);
	
			int n=A.nextInt();
			
				int temp,r,sum=0;
				System.out.println("enter number");
				Scanner A1=new Scanner(System.in);
				n=A1.nextInt();
				temp=n;
				while(n>0) {
					r=n%10;
					sum=sum+(r*r*r);
					n=n/10;
					
				}
					if(sum==temp) {
						System.out.println("Is an Armstrong number");
					}
					else {
						System.out.println("Is not an Armstrong number");
						
					}
					
}
}

	


