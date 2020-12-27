package com.javacourse.springBootDemo.FakeDatabase;

import java.util.List;

import com.javacourse.springBootDemo.Entity.Restoran;

public interface IRestoranData {


	List<Restoran> GetAll();
	Restoran getById(int id);
	void Add(String restoran);
	void Update(int id,Restoran restoran);
	void Delete(int id);
	
}
