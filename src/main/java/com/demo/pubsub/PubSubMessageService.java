package com.demo.pubsub;

import org.springframework.messaging.MessageHandler;

public interface PubSubMessageService {
	public boolean subscribe(MessageHandler msgHandler);
}
