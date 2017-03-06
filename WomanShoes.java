package shop;

public abstract class WomanShoes extends Shoes {

	
	public static class SportWoman extends WomanShoes{
		public SportWoman(String name, String color, int size, double price, String description) {
			super(name, color, size, price, description);
		}

		@Override
		public String getName() {
			return this.getName();
		}
	}
	
	public static class FormalWoman extends WomanShoes {
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
		@Override
		public String getName() {
			return this.getName();
		}
	}
	
	public static class DailyWoman extends WomanShoes{
		public DailyWoman(String name, String color, int size, double price, String description) {
			super(name, color, size, price, description);
		}

		@Override
		public String getName() {
			return this.getName();
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
