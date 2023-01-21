package com_xworkz_javaa.string.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("java");
		System.out.println(s);
		StringBuffer s1=s.append("hello");
		System.out.println(s1);
		System.out.println(s.charAt(2));
		System.out.println(s.capacity());
		System.out.println(s.reverse());
		System.out.println(s.insert(1, 'a'));
		System.out.println(s.isEmpty());
	}
}
