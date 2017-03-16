package com.example.ioana.projectshoesshop.model;

public abstract class Product {

	public enum Type {WOMEN, MEN, BAGS}
	public enum Brand {NIKE, ADIDAS, LOUBOUTIN, LACOSTE, CHRISTIAN_DIOR, GUCCI, TIMBERLAND}
	public enum Color {BLACK, WHITE, GREEN, PURPLE, PINK, RED, GRAY, BROWN, YELLOW, BLUE}

	private Type type;
	private Brand brand;
	private Color color;
	private double price;
	private int count;
	private boolean availability; // when availability is 0, the product is not deleted

	public Product(Brand brand, Color color, double price, int count) {
		if(color != null) {
			this.color = color;
		}
		if(brand != null) {
			this.brand = brand;
		}
		if(price > 0) {
			this.price = price;
		}
		if(count > 0){
			this.count = count;
		}
		this.availability = true;
	}

	public double getPrice(){
		return this.price;
	}
	public void setType(Type type){
		if(type != null){
			this.type = type;
		}
	}
	public boolean getAvailability(){
		return availability;
	}
}
