package com.example.ioana.projectshoesshop;

import android.util.Log;
import com.example.ioana.projectshoesshop.User;
import com.example.ioana.projectshoesshop.User;
import com.example.ioana.projectshoesshop.Information;

import java.util.ArrayList;
import java.util.HashSet;

public class Shop {
	
	private String name;
	private Administrator admin;
	private HashSet<User> users;
	private ArrayList<Product> availability; // products
	
	//The Singleton pattern
	private static Shop instance;
	private Shop(String name){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Shoes Shop";
		}
		this.users = new HashSet<>();
		this.availability = new ArrayList<>();
	}
	public static Shop getInstace(String name){
		if(instance == null){
			instance = new Shop(name);
		}
		return instance;
	}
	
	public String getName(){
		return name;
	}
	public HashSet<User> getUsers() {
		return (HashSet<User>) java.util.Collections.unmodifiableSet(users);
	}
	public Administrator getAdmin() {
		return admin;
	}
	
	public boolean containsEmail(String email){
		for(User user : users){
			if(user.getEmail().equals(email)){
				return true;
			}
		}
		return false;
	}
	public void addAdministrator(Administrator a){
		if(a!=null){
			this.admin = a;
		}
	}
	public void addUser(User user){
		if(user != null){
			this.users.add(user);
		}
	}
	
	public void sellProduct(Product b){
		int i = 0;
		for (Product buy : availability) {
			if(b.equals(buy)){
				if(buy.getAvailability()>0){
					i = buy.getAvailability()-1;
					buy.setAvailability(i);
				}
				else{
					Log.e("no_availability", "No availability!");
				}
			}
		}
	}
	public void addProd(Product buy){
		if(buy != null){
			this.availability.add(buy);
		}
	}
	
	public void settings(){
		// TODO
	}
	public void home(){
		// TODO
	}
	
	@Override
	public String toString() {
		// contacts button
		return "Shop [" + this.name + ", Administrator: " + admin.getFirstName() + "  " + admin.getLastName() + " ]";
	}
	public void printAllUsers(){
		for(User user : users){
			System.out.println(user);
		}
	}
	public void printAllProducts(){
		for(Product product : availability){
			System.out.println(product);
		}
	}

	
}

