package shop;

import java.util.ArrayList;

public class Cart {

	private ArrayList<Product> products;
	private int numberOfProd;
	private double price;
	
	public Cart() {
		this.products = new ArrayList<>();
		this.price = 0;
		this.numberOfProd = 0;
	}
	
	public void addIn(Product b){
		if(b != null && b.getAvailability() > 0){
			this.products.add(b);
			this.price += b.getPrice();
			this.numberOfProd++;
		}
	}
	public void remove(Product b){
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
