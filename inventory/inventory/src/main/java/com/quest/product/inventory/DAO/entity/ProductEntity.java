package com.quest.product.inventory.DAO.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tb")
public class ProductEntity 
{
	@Id
	private int id;
	
	@Column(name="product_name")
	private String productName;
	@Column(name="product_description")
	private String productDescription;
	
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(int id, String productName, String productDescription) {
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
