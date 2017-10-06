package com.demo.gateway;

public class Customer {
	private String customerId;

	public Customer(String customerId) {
		this.customerId = customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}
	
}
