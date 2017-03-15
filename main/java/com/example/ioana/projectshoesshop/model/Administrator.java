package com.example.ioana.projectshoesshop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Administrator extends Information {


	
	private Administrator(String firstName, String lastName, int age, String phoneNumber, String email, String password) {
		super(firstName, lastName, age, phoneNumber, email, password);
	}
	
	private static Administrator adminInstance;
	public static Administrator getInstance(String firstName, String lastName, int age, String phoneNumber, String email, String password){
		if(adminInstance == null){
			adminInstance = new Administrator(firstName, lastName, age , phoneNumber, email, password);
		}
		return adminInstance;		
	}
	public static Administrator getInstance(){
		return adminInstance;
	}

	//Ioana will try
	public void addNewProduct(Product b){
		//create 3 products of that size or type(for bags)
		for (int i =0; i<3 ;i++) {
			shop.addProd(b);
		}
	}
	


}
