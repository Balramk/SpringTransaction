package com.demo.queue.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="messageServiceQ")
public class MessageServiceQ {
	@ServiceActivator(inputChannel="messageChannelQ", autoStartup="true")
	public void processMessage(Message message){
		System.out.println(message.getPayload());
	}
}
