package com.demo.gateway;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
    	CustomerServiceGateway customerService = context.getBean("customerService", CustomerServiceGateway.class);
        
    	System.out.println("Spring Gateway");
    	for(int i = 100; i <= 105; i++) {
    		String id = "CUST-" + i;
 
    		/*Customer customerDetails = customerService.getCustomer(id);
    		System.out.println("The data is "+ customerDetails);*/
    	} 
	}
}
