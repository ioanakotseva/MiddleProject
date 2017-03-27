package com.example.ioana.middleproject.model;

public abstract class Shoes extends Product{

	private int size;

	public Shoes(Brand brand, Color colorType, double price) {
		super(brand, colorType, price, count);
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
