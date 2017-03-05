package shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Administrator {

	private String name; 
	private String email;
	private String username;
	private String password;
	HashMap<User, ArrayList<Buyable>> orders;
	
	private Administrator(String name, String email, String username, String password) {
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			System.out.println("Wrong name");
		}
		
		//strong code for e-mail 
		this.email = email;
		this.username = username;
		//strong password code?
		this.password = password;
		this.orders = new HashMap<>();
	}
	private static Administrator adminInstance;
	public static Administrator getInstance(String name, String email, String username, String password){
		if(adminInstance == null){
			adminInstance = new Administrator(name, email, username, password);
		}
		return adminInstance;		
	}
	
	public void addProduct(Buyable b){
		
	}
	public void takeOrder(User u, ArrayList<Buyable> list){
		this.orders.put(u, list);
	}
	
}
