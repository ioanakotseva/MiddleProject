package com.example.ioana.middleproject.model;


public class WomanShoes extends Shoes {

	public WomanShoes(Brand brand, Color color, double price, int count, int size) {
		super(brand, color, price);
		setType(Type.WOMEN);
		if (size >= 35 && size <= 41) {
			setSize(size);

		}
	}

}