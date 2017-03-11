package shop;

import shop.Shoes.Type;

public abstract class WomanShoes extends Shoes {

	public WomanShoes(String name, String color, String description, double price, int size){
		super(name, color, description, price, size);
		if(size >= 35 && size <= 41){
			super.setSize(size);
		}
		else{
			super.setSize(35);
		}
		this.setType(Type.WOMAN);
	}
	
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
	
}
