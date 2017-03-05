package shop;

public class User {

	private Cart cart;
	private String nameFirst;
	private String nameLast;
	private String email;
	private String password;
	private int age;
	private String phoneNumber;
	
	public User(String nameFirst, String nameLast, String email, String password, int age,
			String phoneNumber) {
		this.cart = new Cart();
		if(nameFirst!=null && !nameFirst.isEmpty() && nameLast!=null && !nameLast.isEmpty()){
			this.nameFirst = nameFirst;
			this.nameLast = nameLast;
		}
		else{
			System.out.println("Wrong name");
			this.nameFirst = "no name";
			this.nameLast = "no name";
		}
		if(email!=null && !email.isEmpty() && isEmail(email)){
			this.email = email;
		}
		else{
			System.out.println("Wrong e-mail!!!");
		}
		if(password!=null && !password.isEmpty()){
			this.password = password;
		}
		else{
			System.out.println("Your password is empty. Original password is: 123456. Please change it!");
			this.password = "123456";
		}
		if(age>13 && age<=120){
			this.age = age;
		}
		else{
			System.out.println("Wrong age validation.");
			this.age=14;
		}
		if(phoneNumber!=null && !phoneNumber.isEmpty() && isPhone(phoneNumber)){
			this.phoneNumber = phoneNumber;
		}
		else{
			System.out.println("Wrong phone number validation.");
		}
	}
	
	static boolean isEmail(String mail){
		int counter = 0;
		for (int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i)=='@'){
				counter++;
			}
		}
		if(counter==1 && mail.charAt(mail.length()-4)=='.' && mail.charAt(mail.length()-3)=='c' &&
				mail.charAt(mail.length()-2)=='o' && mail.charAt(mail.length()-1)=='m'){
			return true;
		}
		return false;
	}
	static boolean isPhone(String number){
		boolean flag = true;
		if(number.length()==10){
			if(number.startsWith("0") && number.charAt(1)=='8'){
				for (char c : number.toCharArray()) {
					flag = Character.isDigit(c);
					if(!flag){
						return false;
					}
				}
				return true;
			}
		}
		if(number.length()==12){
			if(number.charAt(0)=='3' && number.charAt(1)=='5' && number.charAt(1)=='9'){
				for (char c : number.toCharArray()) {
					flag = Character.isDigit(c);
					if(!flag){
						return false;
					}
				}
				return true;
			}
		}
		return false;
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
		// kogato pravi porychka: 
		cart.sendOrder();
		// obhojda elementite v ArrayList-a ot Cart i gi izvajda ot kolekciqta v Shop
		
		//izvikva metoda clearAllCart()
		
	}
}
