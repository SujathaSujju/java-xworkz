package com_xworkz_javaa.Exception.Unchecked_Exception;

public class CallStackDemo {
 
	static int divide(int a,int b) {
		int result = 0;
		try {
			result = divide(a,b);
		}
		catch(NullPointerException e) {
			System.out.println("caught Nullpointerexception");
		}
		return result;
	}
	public static void main(String[] args) {
		try {
			System.out.println(ComputeDivision(20,30));
		}
		catch(NullPointerException e) {
			System.out.println("caught NullPointerException");
			
		}
	}
	private static char[] ComputeDivision(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
