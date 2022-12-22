package com.xworkz.jdbc.service;

import java.util.ArrayList;

import com.xworkz.jdbc.TheatreDto;
import com.xworkz.jdbc.repository.Repository;
import com.xworkz.jdbc.repository.RepositoryImpl;

public class ServiceImpl implements Service{

	Repository repository = new RepositoryImpl();

	public TheatreDto save(TheatreDto theatreDto) {
		if (theatreDto != null) {
			repository.save(theatreDto);
			System.out.println("is not null");
		}
		return theatreDto;
	}

	public ArrayList<TheatreDto> read() {
		return repository.read();

	}

	public String findBy(String theatreName) {
		ArrayList<TheatreDto> theatres = repository.read();
		if (theatres != null) {
			for (TheatreDto theatreDTO : theatres) {
				if (theatreDTO.getTheatreName().equals(theatres)) {
					System.out.println(theatreDTO);

			}
				return theatreName;
			}
			
		return null;
			}
		return theatreName;
	}
	
	}

