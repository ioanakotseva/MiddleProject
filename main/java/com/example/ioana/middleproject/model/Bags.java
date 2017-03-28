package com.example.ioana.middleproject.model;

public class Bags extends Product {

	public Bags(Brand brand, Color colorType, double price, int imageId) {
		super(brand, colorType, price, imageId);
		setType(Type.BAGS);
	}

}
