package shop;

public abstract class Product {
	
	private String name;
	private String color;
	private String description;
	private double price;
	private int availability;
	
	public Product(String name, String color, String description, double price) {
		if(name!=null && !name.isEmpty()){
			this.name = name;
			}
			else{
				this.name = "Shoe";
			}
			if(color!=null && !color.isEmpty()){
				this.color = color;
			}
			else{
				this.color = "black";
			}
			if(price>0){
				this.price = price;
			}
			else{
				this.price = 6;
			}
			if(description!=null && !description.isEmpty()){
				this.description = description;
			}
			else{
				this.description = "No Description!";
			}
			setAvailability(availability);
	}

	public double getPrice(){
		return this.price;
	}
	public String getName(){
		return this.name;
	}
	public int getAvailability(){
		return this.availability;
	}
	public void setAvailability(int i){
		if(i >= 0){
			this.availability = i;
		}
	}
	
	
}
