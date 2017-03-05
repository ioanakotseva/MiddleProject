package shop;

public abstract class WomanShoes extends Shoes {

	
	public class SportWoman extends WomanShoes{
		public SportWoman(String name, String color, int size, double price, String description) {
			super(name, color, size, price, description);
		}
	}
	
	public class FormalWoman extends WomanShoes {
		private double heelSize;
		public FormalWoman(String name, String color, int size, double price, double heelSize, String description) {
			super(name, color, size, price, description);
			if(heelSize>0 && heelSize<=30){
				this.heelSize = heelSize;
			}
			else{
				this.heelSize = 0;
			}
		}
	}
	
	public class DailyWoman extends WomanShoes{
		public DailyWoman(String name, String color, int size, double price, String description) {
			super(name, color, size, price, description);
		}
	}
	
	public WomanShoes(String name, String color, int size, double price, String description) {
		super(name, Type.WOMAN, color, price, description);
		if(size>=36 && size<=41){
			super.setSize(size);
		}
		else{
			super.setSize(35);
		}
	}

	

}
