package com.spring.boot.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.spring.boot.model.ActorInfo;

@Component
public class ObjectMessageConsumer {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@JmsListener(destination = "actor_info")
	public void consumeObjectDataAsMessage(ActorInfo actor) {
		System.out.println("Received Object :: "+actor.toString());
	}
}
