package com.xworkz.jdbc;

public class TheatreDto {

	private int slNo;
	private String theatreName;
	private String location;
	private String filmName;
	private int noOfShows;
	private int seatNo;
	private int showTiming;
	private int noOfScreen;
	private String filmType;
	private String filmLanguage;
	
	public TheatreDto() {
		System.out.println("default constructor");
	}
	
	
	public TheatreDto(int slNo, String theatreName, String location, String filmName, int noOfShows, int seatNo,
			int showTiming, int noOfScreen, String filmType, String filmLanguage) {
		super();
		this.slNo = slNo;
		this.theatreName = theatreName;
		this.location = location;
		this.filmName = filmName;
		this.noOfShows = noOfShows;
		this.seatNo = seatNo;
		this.showTiming = showTiming;
		this.noOfScreen = noOfScreen;
		this.filmType = filmType;
		this.filmLanguage = filmLanguage;
	}
	
	
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getShowTiming() {
		return showTiming;
	}
	public void setShowTiming(int showTiming) {
		this.showTiming = showTiming;
	}
	public int getNoOfScreen() {
		return noOfScreen;
	}
	public void setNoOfScreen(int noOfScreen) {
		this.noOfScreen = noOfScreen;
	}
	public String getFilmType() {
		return filmType;
	}
	public void setFilmType(String filmType) {
		this.filmType = filmType;
	}
	public String getFilmLanguage() {
		return filmLanguage;
	}
	public void setFilmLanguage(String filmLanguage) {
		this.filmLanguage = filmLanguage;
	}
	
	
}
