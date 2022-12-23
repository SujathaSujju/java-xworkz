package com_xworkz_javaa.mapping.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(10001, "RR Nagar");
		map.put(10009, "JP nagar");
		map.put(10003, "Jay nagar");
		map.put(1234, "Ramnagar");
		map.put(1546, "rajiv Nagar");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getValue().equals("Ramnagar")) {
				System.out.println("pincode of Ramnagar is:"+entry.getKey());
			}
		}
		
	}

}
