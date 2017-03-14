package com.example.ioana.projectshoesshop.model;

public abstract class Product {

	enum Brand_Model {NIKE, ADIDAS, LOUBOUTIN, LACOSTE, CHRISTIAN_DIOR, GUCCI, TIMBERLAND};
	private Brand_Model brand_model;
	enum Color {BLACK, WHITE, GREEN, PURPLE, PINK, RED, GRAY};
	private Color colorType;
	private double price;
	//private int availability;
	
	public Product(Brand_Model brand_model, Color colorType, double price) {
			this.brand_model = brand_model;
			this.colorType=colorType;
			if(price>0){
				this.price = price;
			}
			else{
				this.price = 6;
			}
	}

	public double getPrice(){
		return this.price;
	}

	public Brand_Model getBrand_model() {
		return brand_model;
	}

	public Color getColorType() {
		return colorType;
	}
}
