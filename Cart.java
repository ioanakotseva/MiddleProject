package users;

import java.util.ArrayList;

import shop.Buyable;

public class Cart {

	protected ArrayList<Buyable> products;
	private double price;
	private int numberOfProducts;
	//when addInCart(products) -> price+=poducts.price
	
	public Cart() {
		this.products = new ArrayList<Buyable>();
		this.price = 0;
		this.numberOfProducts = 0;
	}
	
	public void addProduct(Buyable b){
		this.products.add(b);
		this.price += b.getPrice();
		this.numberOfProducts++;
	}
	public void removeProduct(Buyable b){
		if(products.contains(b)){
			this.products.remove(b);
		}
	}
	public void clearAll(){
		this.products.clear();
	}

}
