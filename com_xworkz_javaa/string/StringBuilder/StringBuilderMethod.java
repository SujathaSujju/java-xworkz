package com_xworkz_javaa.string.StringBuilder;

public class StringBuilderMethod {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("physics");
		StringBuilder s1 = new StringBuilder("science");
		
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.compareTo(s));
		System.out.println(s.lastIndexOf("physics"));
		System.out.println(s.length());
		System.out.println(s.substring(1, 3));
		System.out.println(s.deleteCharAt(1));
		System.out.println(s.reverse());
	}
}
