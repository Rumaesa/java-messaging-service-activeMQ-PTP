package com.spring.boot.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.spring.boot.model.ActorInfo;

@Component
public class ObjectMessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Scheduled(cron = "*/20 * * * * *")
	public void sendObjectDataAsMessage() {
		ActorInfo actor = new ActorInfo(101, "Rumaesa", "Mumbai");
		jmsTemplate.convertAndSend("actor_info",actor);
		System.out.println("Object Sent!");
	}
}
