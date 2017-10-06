package com.demo.bridge;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="serviceBridge")
public class ServiceBridge {
	@ServiceActivator(inputChannel="pubSubChannel" , autoStartup="true")
	public void publish(Message<String> message) {
		System.out.println(message.getPayload());
		/*String msg = message.getPayload();
		return msg;*/
	}
}
