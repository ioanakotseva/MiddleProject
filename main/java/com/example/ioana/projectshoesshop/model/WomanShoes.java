package com.example.ioana.projectshoesshop.model;


public class WomanShoes extends Shoes {

	public WomanShoes(Brand brand, Color color, double price, int count, int size) {
		super(brand, color, price, count, size);
		setType(Type.WOMEN);
		if (size >= 35 && size <= 41) {
			setSize(size);

		}
	}

	/*
	public static class SportWoman extends WomanShoes{
		public SportWoman(String name, String color, String description, double price, int size){
			super(name, color, description, price, size);
		}
	}
	
	public static class FormalWoman extends WomanShoes {
		private double heelSize;
		public FormalWoman(String name, String color, String description, double price, int size, double heelSize){
			super(name, color, description, price, size);
			if(heelSize > 0 && heelSize <= 30){
				this.heelSize = heelSize;
			}
			else{
				this.heelSize = 0;
			}
		}
	}
	
	public static class DailyWoman extends WomanShoes{
		public DailyWoman(String name, String color, String description, double price, int size){
			super(name, color, description, price, size);
		}
	}
	*/
}
