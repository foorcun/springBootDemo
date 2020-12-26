package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
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
		return restoranManager.get(0).getRestoranAdi();
	}
	
	
	@GetMapping("/restorans")
	public List<Restoran> get2() {
		
		return restoranManager.getAll();
	}
	
	@GetMapping("/lalala")
	public String get3() {
		
		return "Laptop lalala";
	}
	
	
}
