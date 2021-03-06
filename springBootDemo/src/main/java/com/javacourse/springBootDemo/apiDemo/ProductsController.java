package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.springBootDemo.Business.IRestoranService;
import com.javacourse.springBootDemo.Business.RestoranManager;
import com.javacourse.springBootDemo.Entity.Restoran;
import com.javacourse.springBootDemo.FakeDatabase.ArrRestoranData;
import com.javacourse.springBootDemo.FakeDatabase.IRestoranData;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
	
	
	IRestoranData restorans = ArrRestoranData.CreateAsSingleton();
	
	//Restoran restoran = new Restoran("habibi", "asd");
	IRestoranService restoranManager = new RestoranManager(restorans);



	@GetMapping("/")
	public String get() {
		
		//return "Laptopsadf";
		return restoranManager.getById(0).getRestoranAdi();
	}
	
	
	@GetMapping("/restorans")
	public List<Restoran> getAll() {
		
		return restoranManager.getAll();
	}
	
	
	@GetMapping("/restorans/{id}")
	public Restoran getById(@PathVariable int id) {
		
		return restoranManager.getById(id);
	}
	
	
	
	
}
