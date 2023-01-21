package com_xworkz_javaa.Array.singleDimensionArray;

public class FruitsArray {

	final public static void main(String[] args) {

		String str[] = {"apple","orange","banana","mango","jackfruit"};
	
	   
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		String A="apple";	
		int sum=0;
		
		for(int i=0;i<str.length;i++) {
			if(A==str[i]) {
				System.out.println(str[i] + " is present");
				sum++;
			}
		}
			if(sum==0) {
				
				System.out.println("not apple");
			}
			}
	}

	
