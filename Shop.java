package shop;

import java.util.HashSet;

public class Shop {

	private String name;
	private Administrator admin;
	HashSet<User> users;
	//Collection of <Buyable> 
	//when class User makeOrder -> Buyable in remove from this collection
	private Shop(String name){
		this.users = new HashSet<>();
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Shoes Shop";
		}
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
	
}

