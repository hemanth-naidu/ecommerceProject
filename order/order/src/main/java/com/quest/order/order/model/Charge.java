package com.quest.order.order.model;

public class Charge {
	
	private String cardNo;
	private String expiry;
	private String amount;
	
	public Charge() {
		// TODO Auto-generated constructor stub
	}

	public Charge(String cardNo, String expiry, String amount) {
		super();
		this.cardNo = cardNo;
		this.expiry = expiry;
		this.amount = amount;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}

