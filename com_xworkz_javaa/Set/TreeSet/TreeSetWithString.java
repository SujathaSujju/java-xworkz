package com_xworkz_javaa.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetWithString {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new StringComparator());
		ts.add("Apple");
		ts.add("banana");
		ts.add("dog");
		ts.add("cat");
		ts.add("egg");
		
		System.out.println(ts);
	}

}
