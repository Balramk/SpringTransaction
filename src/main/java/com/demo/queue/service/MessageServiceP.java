package com.demo.queue.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="messageServiceP")
public class MessageServiceP {
	@ServiceActivator(inputChannel="queueChannel", autoStartup="true")
	public void processMessage(Message message){
		System.out.println(message.getPayload());
	}
}
