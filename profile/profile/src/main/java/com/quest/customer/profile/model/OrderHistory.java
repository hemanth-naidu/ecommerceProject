package com.quest.customer.profile.model;

public class OrderHistory
{
	private String dateTime;
	private Double price;
	
	public OrderHistory() {
		// TODO Auto-generated constructor stub
	}

	public OrderHistory(String dateTime, Double price) {
		super();
		this.dateTime = dateTime;
		this.price = price;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
