package com.spring.boot.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageConsumer {

	@JmsListener(destination = "testMq1")
	public void readMessage(String txt) {
		System.out.println("Received message :: "+txt);
	}
}
