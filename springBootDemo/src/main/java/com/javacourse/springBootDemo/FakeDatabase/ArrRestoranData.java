package com.javacourse.springBootDemo.FakeDatabase;

import java.util.ArrayList;
import java.util.List;

import com.javacourse.springBootDemo.Entity.Restoran;

public class ArrRestoranData  implements IRestoranData{

	private static ArrRestoranData restoranData;

	
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
	public List<Restoran> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restoran Get(int id) {
		// TODO Auto-generated method stub
		return null;
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