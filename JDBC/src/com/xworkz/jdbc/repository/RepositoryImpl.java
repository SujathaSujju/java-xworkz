package com.xworkz.jdbc.repository;

import java.util.ArrayList;

import com.xworkz.jdbc.TheatreDto;

public class RepositoryImpl implements Repository {

	ArrayList<TheatreDto> theatre = new ArrayList<TheatreDto>();

	@Override
	public ArrayList<TheatreDto> save(TheatreDto theatreDto) {
		theatre.add(theatreDto);
		System.out.println("save in Service");
		return theatre;
	}

	@Override
	public ArrayList<TheatreDto> read() {
		System.out.println("read");
		return theatre;
	}


	@Override
	public ArrayList<TheatreDto> findby(String theatreName) {

		return theatre;
	}

}
