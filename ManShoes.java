package shop;

public abstract class ManShoes extends Shoes {

	public static class SportMan extends ManShoes {
		private boolean isWaterProof;
		public SportMan(String name, String color, int size, double price, String description, boolean isWaterProof) {
			super(name, color, size, price, description);
			this.isWaterProof = isWaterProof;
		}
		@Override
		public String getName() {
			return this.getName();
		}
	}
	public static class FormalMan extends ManShoes {
		private boolean snakeSkin;
		public FormalMan(String name, String color, int size, double price, String description, boolean snakeSkin) {
			super(name, color, size, price, description);
			this.snakeSkin=snakeSkin;
		}
		@Override
		public String getName() {
			return this.getName();
		}
	}
	public static class DailyMan extends ManShoes {
		public DailyMan(String name, String color, int size, double price, String description) {
			super(name, color, size, price, description);
		}

		@Override
		public String getName() {
			return this.getName();
		}
	}
	
	public ManShoes(String name, String color, int size, double price, String description) {
		super(name, Type.MAN, color, price, description);
		if(size>40 && size<=52){
			super.setSize(size);
		}
		else{
			super.setSize(35);
		}
	}

}
