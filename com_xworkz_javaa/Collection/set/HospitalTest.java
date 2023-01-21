package com_xworkz_javaa.Collection.set;

import java.util.HashSet;

import com_xworkz_javaa.Collection.set.model.DoctorDTO;
import com_xworkz_javaa.Collection.set.model.HospitalDTO;
import com_xworkz_javaa.Collection.set.service.HospitalService;
import com_xworkz_javaa.Collection.set.service.HospitalServiceImpl;

public class HospitalTest {

	public static void main(String args[]) {
		
		HospitalService hospitalservice = new HospitalServiceImpl();
		
		DoctorDTO sujatha = new DoctorDTO("sujatha","dentist");
		HashSet<DoctorDTO> doctors = new HashSet<DoctorDTO>();
		doctors.add(sujatha);
		HospitalDTO fortis = new HospitalDTO("fortis",doctors);
		hospitalservice.add(null);
	}
	
}
