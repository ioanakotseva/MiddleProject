package shop;

public class User extends Information{

	private Cart cart;
	private Administrator admin;
	public User(String firstName, String lastName, int age, String phoneNumber, String email, String password){
		super(firstName, lastName, age, phoneNumber, email, password);
			this.cart = new Cart();
			this.shop.addUser(this);
			this.admin = Administrator.getInstance("Ioana", "Kotseva", 20, "0895550175", "ioana.kotseva@gmail.com", "Yoana.kotseva96");
	}
	
	public void singUp(){
		this.shop.addUser(this);
	}
	public void logIn(){
		// TODO
	}
	public void addInCart(Buyable b){
		this.cart.addIn(b);
	}
	public void removeFromCart(Buyable b){
		this.cart.remove(b);
	}
	public void clearAllCart(){
		this.cart.clearAll();
	}
	
	public void makeOrder(){
		this.admin.addInOrders(this, cart.products);
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
