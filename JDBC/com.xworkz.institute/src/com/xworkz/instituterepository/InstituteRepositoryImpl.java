package com.xworkz.instituterepository;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.institute.InstituteDto;

public class InstituteRepositoryImpl implements InstituteRepository{

	ArrayList<InstituteDto> list = new ArrayList<InstituteDto>();
	
	@Override
	public boolean save(InstituteDto dto) {
    list.add(dto);
    System.out.println("saved in repository");
		return true;
	}

	@Override
	public ArrayList<InstituteDto> read() {
		System.out.println("read");
		return list;
	}

	@Override
	public ArrayList<InstituteDto> findByNameAndCourse(String name, String course) {
     for(InstituteDto dto:list) {
    	 if(dto.getName().equals(name) && dto.getCourse().equals(course)) {
         System.out.println(dto);    
    	 }

     }
	return null; 
	}

	@Override
	public ArrayList<InstituteDto> findByLocationAndRating(String location, int rating) {
		for(InstituteDto dto:list) {
			if(dto.getLocation().equals(location)) {
				if(rating>3) {
					System.out.println(dto);
					
				}
			}
		}
		return null;
	
	}

	@Override
	public boolean updateLocationByIndex(String location, int index) {
		
       InstituteDto dto = list.get(index);
    	  dto.getLocation();
    	  dto.setLocation(location);
    	  list.set(index, dto);
    	  
    	  System.out.println("updated location Successfully");
    	  return true;
         
	}

	@Override
	public ArrayList<InstituteDto> updateCourseByName(String course, String name) {
		for(InstituteDto dto:list) {
			dto.getCourse();
			dto.setCourse(course);
			dto.getName();
			dto.setName(name);
			
			System.out.println("updated course Successfully");
			return list;
		}
		return null;
	}

	@Override
	public ArrayList<InstituteDto> deleteByRating(int rating) {
		for(InstituteDto dto:list) {
			list.remove(rating);
		  System.out.println("removed Successfully");
		  		  return list;
        	 }
		return null;
	}
	 }
	




