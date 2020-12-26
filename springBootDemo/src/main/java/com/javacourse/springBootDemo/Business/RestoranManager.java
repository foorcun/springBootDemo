package com.javacourse.springBootDemo.Business;

import java.util.ArrayList;

import com.javacourse.springBootDemo.Entity.Restoran;

public class RestoranManager implements IRestoranService {

	Restoran restoran = new Restoran("busi","businesss");
	
	
	public RestoranManager(Restoran restoran) {
		this.restoran = restoran;
	}

	@Override
	public ArrayList<Restoran> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Restoran get() {
		// TODO Auto-generated method stub
		//return null;
		return this.restoran;
	}

	@Override
	public void add(Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	
	

}
