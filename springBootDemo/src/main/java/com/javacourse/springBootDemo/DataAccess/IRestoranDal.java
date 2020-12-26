package com.javacourse.springBootDemo.DataAccess;

import java.util.List;

import com.javacourse.springBootDemo.Entity.Restoran;

public interface IRestoranDal {

	List<Restoran> getAll();
	Restoran get();
	void add(Restoran restoran);
	void update(Restoran restoran);
	void delete (Restoran restoran);
}
