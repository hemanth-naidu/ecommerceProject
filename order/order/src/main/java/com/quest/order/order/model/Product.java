package com.quest.order.order.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Product 
{
	private int id;
	private String productName;
	private String productDescription;

	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String productName, String productDescription) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	

}
