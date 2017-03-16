package com.example.ioana.projectshoesshop.model;


public class ManShoes extends Shoes {

	public ManShoes(Brand brand, Color colorType, double price, int count, int size) {
		super(brand, colorType, price, count, size);
		setType(Type.MEN);
		if(size >= 41 && size <= 46){
			setSize(size);
		}
	}

	/*public static class SportMan extends ManShoes {
		private boolean isWaterProof;
		public SportMan(String name, String color, String description, double price, int size, boolean isWaterProof) {
			super(name, color, description, price, size);
			this.isWaterProof = isWaterProof;
		}
	}
	public static class FormalMan extends ManShoes {
		private boolean snakeSkin;
		public FormalMan(String name, String color, String description, double price, int size, boolean snakeSkin){
			super(name, color, description, price, size);
			this.snakeSkin=snakeSkin;
		}
	}
	public static class DailyMan extends ManShoes {
		public DailyMan(String name, String color, String description, double price, int size) {
			super(name, color, description, price, size);
		}
	}
	*/

}
