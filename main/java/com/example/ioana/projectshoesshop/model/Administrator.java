package com.example.ioana.projectshoesshop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Administrator extends Information {

	private Administrator(String name, int age, String phoneNumber, String email, String password) {
		super(name, age, phoneNumber, email, password);
	}
	
	private static Administrator adminInstance;
	public static Administrator getInstance(String name, int age, String phoneNumber, String email, String password){
		if(adminInstance == null){
			adminInstance = new Administrator(name, age , phoneNumber, email, password);
		}
		return adminInstance;		
	}
	public static Administrator getInstance(){
		return adminInstance;
	}

	//Ioana will try
	public void addNewProduct(Product b){
			// shop.addProd(b);
	}
	


}
