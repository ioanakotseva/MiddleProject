package shop;

import java.util.ArrayList;

import users.User;

public class Shop {

	private String name;
	private Administrator admin;
	private ArrayList<User> users;
	private ArrayList<Buyable> products;
	
	private Shop(String name){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Shoes Shop";
		}
		this.users = new ArrayList<>();
		this.products = new ArrayList<>();
	}
	
	//The Singleton pattern
	private static Shop instance;
	public static Shop getInstace(String name){
		if(instance == null){
			instance = new Shop(name);
		}
		return instance;
	}
	
	public void addAdministrator(Administrator a){
		this.admin = a;
	}
	public void addUser(User user){
		if(user != null){
			users.add(user);
		}
	}
	
	public void sellProduct(Buyable b){
		products.remove(b);
	}
}

