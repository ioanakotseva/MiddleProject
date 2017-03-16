package com.example.ioana.projectshoesshop.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Shop {
	
	private String name;
	private Administrator admin;
	private TreeSet<User> users;
	private ArrayList<Product> products;
	
	//The Singleton pattern
	private static Shop instance;
	private Shop(String name){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Shoes Shop";
		}
		this.users = new TreeSet<>();
		this.products = new ArrayList<>();
		// this.createProducts();
		// this.createUsers();
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

	public void addProd(Product buy){
		if(buy != null){
			this.products.add(buy);
		}
	}

	public void printAllUsers(){
		for(User user : users){
			System.out.println(user);
		}
	}
	public void printAllProducts(){
		for(Product product : products){
			System.out.println(product);
		}
	}

	// creating 10 random products and 5 random users
	private void createProducts(){
		Random rand = new Random();
		List<Product.Type> types = Collections.unmodifiableList(Arrays.asList(Product.Type.values()));
		List<Product.Brand> brands = Collections.unmodifiableList(Arrays.asList(Product.Brand.values()));
		List<Product.Color> colors = Collections.unmodifiableList(Arrays.asList(Product.Color.values()));
		for(int i = 0; i < 10; i++){
			int randTypeIdx = rand.nextInt(types.size());
			Product.Brand randBrand = brands.get(rand.nextInt(brands.size()));
			Product.Color randColor = colors.get(rand.nextInt(colors.size()));
			double randPrice = (double) rand.nextInt(401) + 50; // random price between 50 and 400
			int randCount = rand.nextInt(10) + 1; // random count between 1 and 10
			int randWSize = rand.nextInt(7) + 35; // random women shoe size
			int randMSize = rand.nextInt(6) + 41; // random men shoe size

			switch (randTypeIdx){
				case 0: this.addProd(new WomanShoes(randBrand, randColor, randPrice, randCount ,randWSize));
					break;
				case 1: this.addProd(new ManShoes(randBrand, randColor, randPrice, randCount, randMSize));
					break;
				case 2: this.addProd(new Bags(randBrand, randColor, randPrice, randCount));
					break;
				default:
					break;
			}
		}
	}
	private void createUsers(){
		Random rand = new Random();
		List<String> names = Collections.unmodifiableList(Arrays.asList("Ivan", "Georgi", "Dani", "Anna", "Sonya"));
		for(int i = 0; i < 5; i++) {
			int randNameIdx = rand.nextInt(names.size());
			String randName = names.get(randNameIdx);
			String randEmail = names.get(randNameIdx) + "@gmail.com";
			String randPassword = names.get(randNameIdx) + "123pass";
			users.add(new User(randName, randPassword));
		}
	}
}
