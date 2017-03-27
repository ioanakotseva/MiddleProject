package com.example.ioana.middleproject.model;

public class Administrator extends User{

	private Administrator(String username, String password) {
		super(username, password);
	}
	private static Administrator adminInstance;
	public static Administrator getInstance(String username, String password){
		if(adminInstance == null){
			adminInstance = new Administrator(username, password);
		}
		return adminInstance;		
	}
	public static Administrator getInstance(){
		return adminInstance;
	}
}
