package com.quest.customer.identity.DAO.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tb")
public class CustomerEntity {
	@Id
	private int id;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_userid")
	private String customerId;
	@Column(name="customer_password")
	private String customerPassword;
	
	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(int id, String customerName, String customerId, String customerPassword) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPassword = customerPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	
}
