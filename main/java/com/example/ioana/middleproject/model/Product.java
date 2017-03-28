package com.example.ioana.middleproject.model;

public abstract class Product {

	public enum Type {WOMEN, MEN, BAGS}
	public enum Brand {NIKE, ADIDAS, LOUBOUTIN, LACOSTE, CHRISTIAN_DIOR, GUCCI, TIMBERLAND}
	public enum Color {GOLD, BLACK, WHITE, GREEN, PURPLE, PINK, RED, GRAY, BROWN, YELLOW, BLUE}

	private Type type;
	private Brand brand;
	private Color color;
	private double price;
	private boolean availability;
	private int imageId;

	public Product(Brand brand, Color color, double price, int imageId) {
		if(color != null) {
			this.color = color;
		}
		if(brand != null) {
			this.brand = brand;
		}
		if(price > 0) {
			this.price = price;
		}
		this.availability = true;
		if(imageId > 0){
			this.imageId = imageId;
		}
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

	public Type getType() {
		return type;
	}
	public Brand getBrand() {
		return brand;
	}
	public Color getColor() {
		return color;
	}
	public boolean isAvailability() {
		return availability;
	}
	public int getImageId() {
		return imageId;
	}

}
