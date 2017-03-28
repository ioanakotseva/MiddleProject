package com.example.ioana.middleproject.model;

import java.util.ArrayList;

public class Shop {

	private String name;
	private ArrayList<Product> availability; // products

	//The Singleton pattern
	private static Shop instance;

	//together
	private Shop(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Shoes Shop";
		}
		this.availability = new ArrayList<>();
	}

	public static Shop getInstace(String name) {
		if (instance == null) {
			instance = new Shop(name);
		}
		return instance;
	}

	//Ioana will try
	public void sellProduct(Product b) {
		for (Product buy : availability) {
			if (b.equals(buy)) {
				this.availability.remove(b);
				break;
			}
		}
	}

	public void addProd(Product buy) {
		if (buy != null) {
			this.availability.add(buy);
		}
	}
}