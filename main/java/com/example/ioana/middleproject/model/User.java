package com.example.ioana.middleproject.model;

public class User {

	private String username;
	private String password;
	
	private String name;
	private int age;
	private String phone;
	
	
	public User(String username, String password) {
		if(username!=null && !username.isEmpty()){
			this.username = username;
		}
		if(password!=null && !password.isEmpty()){
			this.password = password;
		}
	}


	public String getPassword() {
		return password;
	}
	public String getUsername(){return username;}


	public void setPassword(String password) {
		if(password!=null &&!password.isEmpty()){
			this.password = password;
		}
	}


	public void setName(String name) {
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
	}


	public void setAge(int age) {
		if(age>0){
			this.age = age;
		}
	}


	public void setPhone(String phone) {
		if(phone!=null && !phone.isEmpty()){
			this.phone = phone;
		}
	}
	
	
	
	
}
