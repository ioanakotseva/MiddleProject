package com.example.ioana.middleproject.model;

public class Shoes extends Product{

	private int size;

	public Shoes(Brand brand, Color colorType, double price, int imageId, int size) {
		super(brand, colorType, price, imageId);
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
