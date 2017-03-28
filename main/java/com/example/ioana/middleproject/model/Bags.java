package com.example.ioana.middleproject.model;

import java.util.ArrayList;

public class Bags extends Product {

	private static ArrayList<Bags> bags;

	public Bags(Brand brand, Color colorType, double price) {
		super(brand, colorType, price);
		setType(Type.BAGS);
	}

	public static void createNewWomanShoes(Brand brand, double price){
		Bags bag = new Bags(brand,  Color.WHITE, price);
		Bags bag1 = new Bags(brand,  Color.RED, price);
		Bags bag2 = new Bags(brand,  Color.BLACK, price);
		Bags bag3 = new Bags(brand,  Color.BROWN, price);
		bags.add(bag);
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);

	}

}
