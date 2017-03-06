package shop;

import java.util.ArrayList;

public class Cart {

	ArrayList<Buyable> products;
	private double price;
	private int numberOfProd;
	
	public Cart() {
		this.products = new ArrayList<>();
		this.price = 0;
		this.numberOfProd=0;
	}
	
	public void addIn(Buyable b){
		this.products.add(b);
		this.price += b.getPrice();
		this.numberOfProd++;
	}
	public void remove(Buyable b){
		if(products.contains(b)){
			this.products.remove(b);
			this.numberOfProd--;
			this.price-=b.getPrice();
		}
	}
	public void clearAll(){
		this.products.clear();
	}
	
	
}
