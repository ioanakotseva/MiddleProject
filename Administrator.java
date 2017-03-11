package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Administrator extends Information{

	
	HashMap<User, ArrayList<Product>> orders;
	
	private Administrator(String firstName, String lastName, int age, String phoneNumber, String email, String password) {
		super(firstName, lastName, age, phoneNumber, email, password);
		this.orders = new HashMap<>();
	}
	
	private static Administrator adminInstance;
	public static Administrator getInstance(String firstName, String lastName, int age, String phoneNumber, String email, String password){
		if(adminInstance == null){
			adminInstance = new Administrator(firstName, lastName, age , phoneNumber, email, password);
		}
		return adminInstance;		
	}
	public static Administrator getInstance(){
		return adminInstance;
	}
	
	public void addNewProduct(Product b){
			shop.addProd(b);
	}
	
	public void sendProducts(){
		for (Map.Entry<User, ArrayList<Product>> entry : orders.entrySet()) {
			User user = entry.getKey();
			ArrayList<Product> list = entry.getValue();
			for (Product b : list) {
				shop.sellProduct(b);
			}
		}
		System.out.println("All products are send");
	}
	
	public void addInOrders(User u, ArrayList<Product> list){
		this.orders.put(u, list);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
