package shop;

import java.util.ArrayList;

public class Cart {

	//ArrayList with Buyable
	ArrayList<Buyable> products;
	private double price;
	private int numberOfProd;
	//when addInCart(products) -> price+=poducts.price
	
	public Cart() {
		this.products = new ArrayList<>();
	}
	
	public void addIn(Buyable b){
		this.products.add(b);
		this.price += b.getPrice();
	}
	public void remove(Buyable b){
		this.products.remove(b);
	}
	public void clearAll(){
		this.products.clear();
	}
	
	public void sendOrder(){
		
	}
}
