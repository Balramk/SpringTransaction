package com.demo.queue.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="messageServiceR")
public class MessageServiceR {
	@ServiceActivator(inputChannel="messageChannelR", autoStartup="true")
	public void processMessage(Message message){
		System.out.println(message.getPayload());
	}
}
