package com_xworkz_javaa.mapping.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestOfBankCustomer {

	public static void main(String args[]) {
		
		Bank hdfc = new Bank();
		hdfc.setLoc("bangalore");
		hdfc.setName("hdfc");
		
		Bank sbi = new Bank();
		sbi.setLoc("ballary");
		sbi.setName("sbi");
		
		Bank karnataka = new Bank();
		karnataka.setLoc("koppal");
		karnataka.setName("karnataka");
		
		Customer sujatha= new Customer();
		sujatha.setId("54586594769AC");
		sujatha.setName("sujatha");
		sujatha.setLoc("hosapete");
		
		Customer drakshi = new Customer();
		drakshi.setId("4768469456796AC");
		drakshi.setName("drakshi");
		drakshi.setLoc("manglore");
		
		ArrayList<Customer> customerList1 = new ArrayList<>();
		customerList1.add(sujatha);
		customerList1.add(drakshi);
		
		Customer priya = new Customer();
		priya.setId("856794574543AC");
		priya.setName("priya");
		priya.setLoc("belagavi");
		
		Customer meghana = new Customer();
		meghana.setId("876458975345AC");
		meghana.setName("meghana");
		meghana.setLoc("bagalkot");
		
		ArrayList<Customer> customerList2 =new ArrayList<>();
		customerList2.add(priya);
		customerList2.add(meghana);
		
		Customer santhosh = new Customer();
		santhosh.setId("856794574543AC");
		santhosh.setName("santhosh");
		santhosh.setLoc("belagavi");
		
		Customer abhilash = new Customer();
		abhilash.setId("876458975345AC");
		abhilash.setName("abhilash");
		abhilash.setLoc("bagalkot");
		
		ArrayList<Customer> customerList3 = new ArrayList<>();
		customerList3.add(santhosh);
		customerList3.add(abhilash);
		
		HashMap<Bank,ArrayList<Customer>> mapBankAndCustomers = new HashMap<>();
		mapBankAndCustomers.put(hdfc, customerList1);
		mapBankAndCustomers.put(sbi, customerList2);
		mapBankAndCustomers.put(karnataka, customerList3);
		
		for(Map.Entry<Bank, ArrayList<Customer>> entry : mapBankAndCustomers.entrySet()) {
			if(entry.getKey().getName().equals("hdfc")) {
				System.out.println("hdfc bank customer details");
				
				for(Customer customer : entry.getValue()) {
				System.out.println("Customer : ");
				System.out.println("name : "+ customer.getName());
			    System.out.println("id : "+customer.getId());
			    System.out.println("Location : "+customer.getLoc());
				} 
			}
		}
		
	}
}
