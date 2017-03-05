package shop;

public class Administrator extends Information{
	
	// singleton administrator
	private Administrator(String firstName, String lastName, int age, String phoneNumber, String email, String password) {
		super(firstName, lastName, age, phoneNumber, email, password);
	}
	
	private static Administrator adminInstance;
	public static Administrator getInstance(String name, String lastName, int age, String email, String username, String password){
		if(adminInstance == null){
			adminInstance = new Administrator(name, lastName, age, email, username, password);
		}
		return adminInstance;		
	}
	
	public void addProduct(Buyable product){
		// TODO
	}
	
	
}
