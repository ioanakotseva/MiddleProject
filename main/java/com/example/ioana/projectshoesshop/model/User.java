package com.example.ioana.projectshoesshop.model;

public class User extends Information{

	private Cart cart;
	private static Administrator admin = Administrator.getInstance();
	private Shop shop;
	
	public User(String firstName, String lastName, int age, String phoneNumber, String email, String password){
		super(firstName, lastName, age, phoneNumber, email, password);
		this.cart = new Cart();
		this.shop.addUser(this);
		// this.admin = Administrator.getInstance("Ioana", "Kotseva", 20, "0895550175", "ioana.kotseva@gmail.com", "Yoana.kotseva96");
	}

	public void deleteAccount(){
		this.shop.getUsers().remove(this);
	}
	public boolean logIn(String email, String password){
		// logIn will return true, if your logging is successful
		if(!shop.containsEmail(email)){
			return false;
		}
		if(this.getPassword().equals(password)){
			return true;
		}
		System.out.println("Invalid e-mail or password!");
		return false;
	}

	
	public void changePassword(String oldPassword, String newPassword, String newPasswordAgain){
		if(!this.getPassword().equals(oldPassword)){
			System.out.println("Wrong password!");
			return;
		}
		if(!newPassword.equals(newPasswordAgain)){
			System.out.println("Passwords confirmation error!");
			return;
		}
		this.setPassword(newPassword);
	}
	
	
	public void addInCart(Product b){
		this.cart.addIn(b);
	}
	public void removeFromCart(Product b){
		this.cart.remove(b);
	}
	public void clearAllCart(){
		this.cart.clearAll();
	}
	
	public void makeOrder(){
		for (Product product : cart.getProducts()) {
			shop.sellProduct(product);
		}
		this.cart.clearAll();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		return true;
	}

}
