package com.javacourse.springBootDemo.DataAccess;

import java.util.ArrayList;

import com.javacourse.springBootDemo.Entity.Restoran;

public interface IRestoranDal {

	ArrayList<Restoran> getAll();
	Restoran get();
	void add(Restoran restoran);
	void update(Restoran restoran);
	void delete (Restoran restoran);
}
