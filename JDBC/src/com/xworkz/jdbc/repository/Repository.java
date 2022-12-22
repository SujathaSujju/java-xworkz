package com.xworkz.jdbc.repository;

import java.util.ArrayList;

import com.xworkz.jdbc.TheatreDto;

public interface Repository {

	   ArrayList<TheatreDto> save(TheatreDto theatreDto);
       String findBy(String theatreName);
		ArrayList<TheatreDto> read();
}
