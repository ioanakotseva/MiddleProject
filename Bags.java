package shop;

public class Bags implements Buyable{

	private String name;
	private String color;
	private String text;
	private double price;
	
	public Bags(String name, String color, double price, String text){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Bag";
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
			this.price = 4;
		}
		if(text!=null && !text.isEmpty()){
			this.text = text;
		}
		else{
			this.text= "No Description!";
		}
	}

	public double getPrice() {
		return price;
	}
	
	
}
