package com_xworkz_javaa.Collection.set.service;

import com_xworkz_javaa.Collection.set.model.HospitalDTO;
import com_xworkz_javaa.Collection.set.repository.HospitalRepository;
import com_xworkz_javaa.Collection.set.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService{

	HospitalRepository hospitalrepository = new HospitalRepositoryImpl();
	
	
	@Override
	public void add(HospitalDTO hospitaldetail) {
     if(hospitaldetail != null) {
    	 hospitalrepository.add(hospitaldetail);
     }
     
     else {
    	 System.out.println("no content found in Hospital detail");
     }
		
	}
	

}
