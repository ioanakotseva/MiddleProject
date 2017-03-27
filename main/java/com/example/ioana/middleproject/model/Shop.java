package com.example.ioana.middleproject.model;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Shop {
	
	private String name;
	private ArrayList<Product> availability; // products
	
	//The Singleton pattern
	private static Shop instance;
	//together
	private Shop(String name){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Shoes Shop";
		}
		this.availability = new ArrayList<>();
	}

	public static Shop getInstace(String name){
		if(instance == null){
			instance = new Shop(name);
		}
		return instance;
	}

	//Ioana will try
	public void sellProduct(Product b){
		for (Product buy : availability) {
			if(b.equals(buy)){
				this.availability.remove(b);
				break;
			}
		}
	}
	public void addProd(Product buy){
		if(buy != null){
			this.availability.add(buy);
		}
	}

	public void printAllProducts(){
		for(Product product : availability){
			System.out.println(product);
		}
	}
	//Niki will try
	public static void createProducts(){
		Random r = new Random();
	//	Product.Brand_Model randomModel = Product.Brand_Model.
		for (int i = 35; i<=41 ; i++){
			//WomanShoes womanShoe = new WomanShoes();
			}
		}
	}



