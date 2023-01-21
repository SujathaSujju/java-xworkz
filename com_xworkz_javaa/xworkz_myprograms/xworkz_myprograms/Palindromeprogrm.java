package xworkz_myprograms;

import java.util.Scanner;

import com_xworkz_javaa.string.StringCharAt;

public class Palindromeprogrm {

	public static void main(String[] args) {
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("enter the string");
		
			String s = scan.next();
			
			String rev="";
			
			System.out.println(s);
			
			for(int i=s.length()-1;i>=0;i--) {
				
				
				
				rev = rev+i;
				
				
			}
			System.out.println(rev);
			if(s.equals(rev)) {
				System.out.println(rev+ " is palindrome");
			}
			else {
				System.out.println(rev+ " is not palindrome");
			}
			
			
		}
		
	}
}
