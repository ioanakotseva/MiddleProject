package shop;

import java.util.HashSet;

public abstract class Shoes implements Buyable{

	private String name;
	enum Type {WOMAN, MAN};
	private Type type;
	private String color;
	private int size;
	private double price;
	private String description;
	private int availability;
	
	public Shoes(String name, Type type, String color, double price, String description) {
		if(name!=null && !name.isEmpty()){
		this.name = name;
		}
		else{
			this.name = "Shoe";
		}
		this.availability = 10;
		this.type = type;
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
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}
	@Override
	public int getAvailability() {
		return availability;
	}

	@Override
	public int setAvailability(int i) {
		this.availability = i;
		return this.availability;
	}

	@Override
	public String toString() {
		return "Shoes [name=" + name + "]";
	}
	
}
