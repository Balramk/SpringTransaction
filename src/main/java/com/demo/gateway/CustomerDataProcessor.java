package com.demo.gateway;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint(value="custDataProcessor")
public class CustomerDataProcessor {
	@ServiceActivator(inputChannel="requestChannel", autoStartup="true")
	public void processData(Customer customer) {
		System.out.println(customer.toString());
	}
}
