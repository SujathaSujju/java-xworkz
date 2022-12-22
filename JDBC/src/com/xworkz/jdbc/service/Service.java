package com.xworkz.jdbc.service;

import java.util.ArrayList;

import com.xworkz.jdbc.TheatreDto;

public interface Service {

	TheatreDto save(TheatreDto theatreDto);
	 
    ArrayList<TheatreDto> read();
    
    String findBy(String theatreName);
}
