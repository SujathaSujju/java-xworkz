package com_xworkz_javaa.Array.singleDimensionArray;

public class LeastElement {

	public static void main(String[] args) {

		char[] arr = new char[4];
		
		arr[0] = 'b';
		arr[1] = 'c';
		arr[2] = 'a';
		arr[3] = 'd';
			
		for(char i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			
		}
		char min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
				}
		}
		System.out.println("least element is " +min);
    
	}

}
