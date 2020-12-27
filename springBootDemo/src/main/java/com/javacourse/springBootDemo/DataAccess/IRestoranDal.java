package com.javacourse.springBootDemo.DataAccess;

import java.util.ArrayList;

import com.javacourse.springBootDemo.Entity.Restoran;

public interface IRestoranDal {

	ArrayList<Restoran> getAll();
	Restoran getById(int id);
	void add(Restoran restoran);
	void update(int id,Restoran restoran);
	void delete(int id);
}
