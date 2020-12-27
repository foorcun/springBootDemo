package com.javacourse.springBootDemo.Business;

import java.util.ArrayList;
import java.util.List;

import com.javacourse.springBootDemo.Entity.Restoran;


public interface IRestoranService {

	List<Restoran> getAll();
	Restoran getById(int id);
	Restoran add(Restoran restoran);
	void update(int id,Restoran restoran);
	void delete(int id);
	
}
