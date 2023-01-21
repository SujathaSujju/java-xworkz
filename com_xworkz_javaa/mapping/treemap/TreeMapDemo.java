package com_xworkz_javaa.mapping.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

     TreeMap<Integer,String> tm = new TreeMap<>();
     
     tm.put(1, "sunday");
     tm.put(3, "tuesday");
     tm.put(2, "monday");
     tm.put(5, "thursday");
     tm.put(4, "wednesday");
     tm.put(6, "friday");
     tm.put(7, "saturday");
     
     for(Map.Entry<Integer, String> entry:tm.entrySet()) {
    	 System.out.println(entry.getKey()+":"+entry.getValue());
    	 //System.out.println(tm);
     }
	}

}
