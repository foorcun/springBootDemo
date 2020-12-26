package com.javacourse.springBootDemo.Business;

import java.util.ArrayList;
import java.util.List;

import com.javacourse.springBootDemo.Entity.Restoran;


public interface IRestoranService {

	ArrayList<Restoran> getAll();
	Restoran get();
	void add(Restoran restoran);
	void update(Restoran restoran);
	void delete (Restoran restoran);
	
}
