package com.javacourse.springBootDemo.Business;

import java.util.ArrayList;

import com.javacourse.springBootDemo.Entity.Restoran;
import com.javacourse.springBootDemo.FakeDatabase.IRestoranData;

public class RestoranManager implements IRestoranService {

	// RestoranData = arraylist for restorant
	private IRestoranData restoranData;
	
	//Restoran restoran = new Restoran("busi","businesss");
	
	
	public RestoranManager(IRestoranData restoranData) {
		this.restoranData = restoranData;
	}

	@Override
	public ArrayList<Restoran> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Restoran get(int id) {
		// TODO Auto-generated method stub
		//return null;
		//return this.restoranData.Get(id);
		return this.restoranData.Get(id);
	}

	@Override
	public void add(Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id,Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
