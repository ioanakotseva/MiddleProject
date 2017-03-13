package com.example.ioana.projectshoesshop.shop;

public abstract class Information {

	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;
	private String email;
	private String password;
	protected static Shop shop;
	
	public Information(String firstName, String lastName, int age, String phoneNumber, String email, String password) {
		this.shop = Shop.getInstace("Shoes Shop");
		if(firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		if(age >= 18){
			this.age = age;
		}
		if(isValidPhone(phoneNumber)){
			this.phoneNumber = phoneNumber;
		}
		if(isValidEmail(email)){
			this.email = email;
		}
		setPassword(password);
	}
	
	static boolean isValidPhone(String number){
		// works only with bulgarian  phone numbers
		if(number == null || number.isEmpty()){
			return false;
		}
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
			// starts with "+" ?
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
	static boolean isValidEmail(String mail){
		if(mail == null || mail.isEmpty()){
			return false;
		}
		int counter = 0;
		for (int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i)=='@'){
				counter++;
			}
		}
		if(counter==1 && ((mail.charAt(mail.length()-4)=='.' && mail.charAt(mail.length()-3)=='c' &&
				mail.charAt(mail.length()-2)=='o' && mail.charAt(mail.length()-1)=='m')) || 
				(mail.charAt(mail.length()-3)=='.' && mail.charAt(mail.length()-2)=='b' &&
				mail.charAt(mail.length()-1)=='g')){
			return true;
		}
		return false;
	}
	static boolean isStrongPassword(String password){
		// A strong password has at least 5 symbols( small letters, capital letters and digits).
		boolean hasSmallLetter = false;
		boolean hasCapitalLetter = false;
		boolean hasDigit = false;
		
		if(password.length() < 5){
			return false;
		}
		
		for(char c : password.toCharArray()){
			if(c >= 'a' && c <= 'z'){
				hasSmallLetter = true;
			}
			if(c >= 'A' && c <= 'Z'){
				hasCapitalLetter = true;
			}
			if(c >= '1' && c <= '9'){
				hasDigit = true;
			}
			if(hasSmallLetter && hasCapitalLetter && hasDigit){
				return true;
			}
		}
		return false;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password != null && !password.isEmpty() && isStrongPassword(password)){
			this.password = password;
		}
	}

	@Override
	public String toString() {
		return "User[" + firstName + " | " + lastName + " | " + age + " | " + age + " | " + phoneNumber + 
				" | " + email + " | " + password + " | " +
				shop.getName() + " ]" ;			
	}
	
}


