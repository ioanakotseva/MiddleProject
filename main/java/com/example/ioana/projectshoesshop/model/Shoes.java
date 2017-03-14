package com.example.ioana.projectshoesshop.model;

public abstract class Shoes extends Product{

	protected enum Type {WOMAN, MAN};
	private Type type;
	private int size;
	
	public Shoes(Type type,Brand_Model brand_model,Color colorType, double price, int size) {
		super( brand_model, colorType, price);
		this.size=size;
		this.type=type;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setType(Type t){
		if(t != null){
			this.type = t;
		}
	}
	
}
