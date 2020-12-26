package com.javacourse.springBootDemo.Business;

import java.util.List;

import com.javacourse.springBootDemo.Entity.Restoran;


public interface IRestoranService {

	List<Restoran> getAll();
	Restoran get();
	void add(Restoran restoran);
	void update(Restoran restoran);
	void delete (Restoran restoran);
	
}
