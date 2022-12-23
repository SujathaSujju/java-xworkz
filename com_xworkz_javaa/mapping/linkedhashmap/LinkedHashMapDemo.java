package com_xworkz_javaa.mapping.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
    
		LinkedHashMap<Character,String> phonics = new LinkedHashMap<>();

		phonics.put('A',"Apple");
		phonics.put('B',"bag");
		phonics.put('D',"Dog");
		phonics.put('C',"Cat");
		
		System.out.println(phonics);
		
	}

}
