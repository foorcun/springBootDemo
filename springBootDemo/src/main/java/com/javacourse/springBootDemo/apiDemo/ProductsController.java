package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.springBootDemo.Business.IRestoranService;
import com.javacourse.springBootDemo.Business.RestoranManager;
import com.javacourse.springBootDemo.Entity.Restoran;

@RestController
public class ProductsController {
	
	
	Restoran restoran = new Restoran("habibi", "habhab");
	IRestoranService restoranManager = new RestoranManager(restoran);



	@GetMapping("/")
	public String get() {
		
		//return "Laptopsadf";
		return restoranManager.get().getRestoranAdi();
	}
	
	
	@GetMapping("/products")
	public String get2() {
		
		return "Laptop 2";
	}
	
	@GetMapping("/lalala")
	public String get3() {
		
		return "Laptop lalala";
	}
	
	
}
