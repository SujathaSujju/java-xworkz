package com.xworkz.jdbc;

import java.util.ArrayList;
import java.util.List;
import com.xworkz.jdbc.service.Service;
import com.xworkz.jdbc.service.ServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		Service service = new ServiceImpl();

		TheatreDto miraz = new TheatreDto();
		miraz.setSlNo(1);
		miraz.setTheatreName("Miraz");
		miraz.setLocation("Gulbarga");
		miraz.setNoOfShows(6);
		miraz.setFilmLanguage("kannada");
		miraz.setFilmName("kantara");
		miraz.setFilmType("devotional");
		miraz.setNoOfScreen(3);
		miraz.setSeatNo(50);
		miraz.setShowTiming(12);
	
		TheatreDto galaxy = new TheatreDto();
		galaxy.setSlNo(2);
		galaxy.setTheatreName("galaxy");
		galaxy.setLocation("yelahanka");
		galaxy.setNoOfShows(5);
		galaxy.setFilmLanguage("kannada");
		galaxy.setFilmName("kgf");
		galaxy.setFilmType("action film");
		galaxy.setNoOfScreen(3);
		galaxy.setSeatNo(70);
		galaxy.setShowTiming(9);
		
		TheatreDto lakshmi = new TheatreDto();
		lakshmi.setSlNo(2);
		lakshmi.setTheatreName("lakshmi");
		lakshmi.setLocation("yeshwanthpur");
		lakshmi.setNoOfShows(5);
		lakshmi.setFilmLanguage("telugu");
		lakshmi.setFilmName("sita ramam");
		lakshmi.setFilmType("love");
		lakshmi.setNoOfScreen(4);
		lakshmi.setSeatNo(80);
		lakshmi.setShowTiming(1);
		
		TheatreDto bala = new TheatreDto();
		bala.setSlNo(2);
		bala.setTheatreName("bala");
		bala.setLocation("hospet");
		bala.setNoOfShows(3);
		bala.setFilmLanguage("hindi");
		bala.setFilmName("bramhasthra");
		bala.setFilmType("action film");
		bala.setNoOfScreen(2);
		bala.setSeatNo(20);
		bala.setShowTiming(12);
		
		TheatreDto meeralam = new TheatreDto();
		meeralam.setSlNo(2);
		meeralam.setTheatreName("meeralam");
		meeralam.setLocation("hosapete");
		meeralam.setNoOfShows(2);
		meeralam.setFilmLanguage("english");
		meeralam.setFilmName("titanic");
		meeralam.setFilmType("discovery");
		meeralam.setNoOfScreen(1);
		meeralam.setSeatNo(30);
		meeralam.setShowTiming(2);
		
		
		ArrayList<TheatreDto> theatres = new ArrayList<TheatreDto>();
		TheatreDto inox = new TheatreDto(1,"inox","btm","oke jeevitham",4,50,12,3,"inventory","telugu");
		
		
		service.save(miraz);
		service.save(galaxy);
		service.save(lakshmi);
		service.save(bala);
		service.save(meeralam);
		service.save(inox);
		
		theatres.add(inox);
		theatres.add(miraz);
		theatres.add(galaxy);
		theatres.add(lakshmi);
		theatres.add(bala);
		theatres.add(meeralam);
		
		
		     ArrayList<TheatreDto> dto = service.read();
		   for (TheatreDto theatreDTO : dto) {
			   System.out.println(theatreDTO);	
		}
		 
		   service.findBy("inox");  
}

	

}
