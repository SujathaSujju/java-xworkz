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

	public TheatreDto findBy(String theatreName) {
		ArrayList<TheatreDto> theatres = repository.read();
		 for(TheatreDto th:theatres) {
			 if(th.getTheatreName().equals(theatreName)) {
					System.out.println(th);
					
				 }
				return null;
			}
		return null;
			
	}
	
	}

