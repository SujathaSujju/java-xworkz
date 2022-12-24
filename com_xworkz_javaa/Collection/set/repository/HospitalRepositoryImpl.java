package com_xworkz_javaa.Collection.set.repository;

import java.util.HashSet;

import com_xworkz_javaa.Collection.set.model.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository{
	
	HashSet<HospitalDTO> hospitals = new HashSet<HospitalDTO>();

	@Override
	public void add(HospitalDTO hospitaldetail) {
     hospitals.add(hospitaldetail);
     System.out.println("hospitaldetails detail added successfully");
		
	}
	

}
