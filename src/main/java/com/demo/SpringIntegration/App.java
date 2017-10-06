package com.demo.SpringIntegration;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.integration.channel.PriorityChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.demo.gateway.Customer;
import com.demo.gateway.CustomerServiceGateway;


public class App 
{
    public static void main( String[] args )
    {
    	GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
    	//MessageChannel channel = context.getBean("queueChannel",MessageChannel.class);

    	// Direct-Channel
    	/*	Message<String> massage = MessageBuilder.withPayload("FirstMessage").build();
    	chennel.send(message);*/
    	
    	
    	//Queue-Channel
    	/*String[] messages = {"Balram","Ankush","Aarati","Subha","Shruti","Vijay"};
    	for(int i=0; i<messages.length; i++) {
    		Message<String> msg = MessageBuilder.withPayload(messages[i]).build();
    		channel.send(msg);
    	}*/
    	
    	//Priority-Channel
    	/*PriorityChannel priorityChannel = context.getBean("queueChannel",PriorityChannel.class);
    	String[] messages = {"Balram","Ankush","Aarati","Subha","Shruti","Vijay"};
    	for(int i=0; i<messages.length; i++) {
    		Message<String> msg = MessageBuilder.withPayload(messages[i]).setHeader(IntegrationMessageHeaderAccessor.PRIORITY,2).build();
    		channel.send(msg);
    	}*/
    	
    	//Rendezvous-Channel
    	
    	
    	//Message-Bridge
    	/*PublishSubscribeChannel psChannel = context.getBean("pubSubChannel",PublishSubscribeChannel.class);
        Message<String> msg = MessageBuilder.withPayload("Hello Bridge").build();
        psChannel.send(msg);*/
    	
    	
    	//Gate-way
        /*Customer c = new Customer("100");
        CustomerServiceGateway gateWay = context.getBean("customerServiceGateway",CustomerServiceGateway.class);
        gateWay.publishData(c);*/
    }
}
