package com.example.ioana.middleproject.model;


import java.util.ArrayList;
import java.util.HashMap;

public class ManShoes extends Shoes {

	private static ArrayList<ManShoes> manShoes = new ArrayList<>();

	private ManShoes(Brand brand, Color colorType, double price, int size) {
		super(brand, colorType, price);
		setType(Type.MEN);
	}

	public static void createNewShoes(Brand brand, Color colorType, double price){
		for (int i = 40; i<=51; i++){
			ManShoes shoe = new ManShoes(brand, colorType, price, i);
			//ManShoes shoe2 = new ManShoes(brand, colorType, price, i);
			manShoes.add(shoe);
			//manShoes.add(shoe2);
		}
	}

}
