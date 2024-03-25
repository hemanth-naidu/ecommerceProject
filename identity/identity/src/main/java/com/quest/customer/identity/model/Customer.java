package com.quest.customer.identity.model;

public class Customer 
{
	private String name;
	private String userId;
	private String password;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String userId, String password) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
