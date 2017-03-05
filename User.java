package users;

import shop.Buyable;
import shop.Information;
import shop.Shop;

public class User extends Information {

	private Cart cart;
	
	public User(String firstName, String lastName, int age, String phoneNumber, String email, String password){
		super(firstName, lastName, age, phoneNumber, email, password);
		this.cart = new Cart();
		this.shop.addUser(this);
	}
	
	public void addInCart(Buyable b){
		this.cart.addProduct(b);
	}
	public void removeFromCart(Buyable b){
		this.cart.removeProduct(b);
	}
	public void clearAllCart(){
		this.cart.clearAll();
	}
	
	public void makeOrder(){
		// TODO
		// kogato pravi porychka: 
		// obhojda elementite v ArrayList-a ot Cart i gi izvajda ot kolekciqta v Shop
		//izvikva metoda clearAllCart()
		for(Buyable b : cart.products){
			this.shop.sellProduct(b);
		}
		clearAllCart();
	}
}
