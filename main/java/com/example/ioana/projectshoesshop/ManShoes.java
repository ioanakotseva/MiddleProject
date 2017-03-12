package com.example.ioana.shoesshop;

public abstract class ManShoes extends Shoes {

	public ManShoes(String name, String color, String description, double price, int size) {
		super(name, color, description, price, size);
		this.setType(Type.MAN);
		if(size>40 && size<=52){
			super.setSize(size);
		}
		else{
			super.setSize(40);
		}
	}
	
	public static class SportMan extends ManShoes {
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

}
