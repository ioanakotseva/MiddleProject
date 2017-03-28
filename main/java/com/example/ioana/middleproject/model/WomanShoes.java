package com.example.ioana.middleproject.model;


import java.util.ArrayList;

public class WomanShoes extends Shoes {

	private static ArrayList<WomanShoes> womanShoes = new ArrayList<>();

	public WomanShoes(Brand brand, Color color, double price, int size) {
		super(brand, color, price);
		setType(Type.WOMEN);
		if (size >= 35 && size <= 41) {
			setSize(size);
		}
	}
	public static void createNewWomanShoes(Brand brand, Color colorType, double price){
		for (int i = 35; i<=42; i++){
			WomanShoes shoe = new WomanShoes(brand, colorType, price, i);
			womanShoes.add(shoe);
		}
	}

}