package com.example.ioana.projectshoesshop.model;

public class Bags extends Product {

	public Bags(Brand brand, Color colorType, double price, int count) {
		super(brand, colorType, price, count);
		setType(Type.BAGS);
	}

}
