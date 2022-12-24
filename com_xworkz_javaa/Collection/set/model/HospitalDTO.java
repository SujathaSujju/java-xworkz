package com_xworkz_javaa.Collection.set.model;

import java.util.HashSet;

public class HospitalDTO {

	String name;
	HashSet<DoctorDTO> doctors;
	
	public HospitalDTO(String name,HashSet<DoctorDTO> doctors) {
		this.name = name;
		this.doctors = doctors;
	}
}
