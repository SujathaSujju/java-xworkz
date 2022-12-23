package com_xworkz_javaa.mapping.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ManagerEmployee {

	public static void main(String[] args) {
		 
		Manager sujatha = new Manager();
		sujatha.setId("s11");
		sujatha.setName("sujatha");
		
		Manager siri = new Manager();
		siri.setId("s12");
		siri.setName("shirisha");
		
		Employee shambhu = new Employee();
		shambhu.setId("e11");
		shambhu.setName("shambhu");
		
		Employee sharat = new Employee();
		sharat.setId("e12");
		sharat.setName("sharat");
		
		ArrayList<Employee> employeeList1 = new ArrayList<>();
		employeeList1.add(sharat);
		employeeList1.add(shambhu);
		
		Employee santhosh = new Employee();
		santhosh.setId("e13");
		santhosh.setName("santhosh");
		
		Employee abhi = new Employee();
		abhi.setId("e14");
		abhi.setName("abhi");
		
		ArrayList<Employee> employeeList2 = new ArrayList<>();
		employeeList2.add(santhosh);
		employeeList2.add(abhi);
		
		HashMap<Manager,ArrayList<Employee>> mapManagerAndEmployees = new HashMap<>();
		
		mapManagerAndEmployees.put(sujatha, employeeList1);
		mapManagerAndEmployees.put(siri, employeeList2);
		
		for(Map.Entry<Manager, ArrayList<Employee>> entry : mapManagerAndEmployees.entrySet()) {
			System.out.print(entry.getKey().getName() + ":");
			Iterator<Employee> itr = entry.getValue().iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next().getName()+",");
				
			}
			System.out.println();
			
		}
	}
}
