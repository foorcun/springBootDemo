package com.javacourse.springBootDemo.FakeDatabase;

import java.util.ArrayList;

import com.javacourse.springBootDemo.Entity.Restoran;

public class ArrRestoranData  implements IRestoranData{

	private static ArrRestoranData restoranData;

	// de facto databaseimiz
	ArrayList<Restoran> restorans = new ArrayList<>();

	

	private ArrRestoranData(){

	//restorans datas
	restorans.add(new Restoran("id1","retro"));
	restorans.add(new Restoran("id2","kedi"));
	restorans.add(new Restoran("id3","medi"));



	}

	public static ArrRestoranData CreateAsSingleton(){

	if(restoranData == null){
	  restoranData = new ArrRestoranData();
	}

	return restoranData;


	}

	
	
	
	
	
	
	
	@Override
	public ArrayList<Restoran> GetAll() {
		// TODO Auto-generated method stub
		return restorans;
	}

	@Override
	public Restoran getById(int id) {
		// TODO Auto-generated method stub
		//return null;
		return restorans.get(id);
	}

	@Override
	public void Add(Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(int id, Restoran restoran) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}


	
	

}
