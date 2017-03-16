package com.example.ioana.projectshoesshop.model;

public abstract class Shoes extends Product{

	private int size;

	public Shoes(Brand brand, Color colorType, double price, int count, int size) {
		super(brand, colorType, price, count);
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
