package com.javacourse.springBootDemo.Entity;

public class Restoran {

	private String restoranId;
	private String restoranAdi = "restoran";
	
	
	
	public Restoran(String restoranId,String restoranAdi){
		  
		  this.restoranId = restoranId;
		  this.restoranAdi = restoranAdi;

		}
	
	public String getRestoranId() {
		return restoranId;
	}

	public void setRestoranId(String restoranId) {
		this.restoranId = restoranId;
	}

	public String getRestoranAdi() {
		return restoranAdi;
	}

	public void setRestoranAdi(String name) {
		this.restoranAdi = name;
	}
}
