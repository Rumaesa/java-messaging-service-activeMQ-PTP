package com.spring.boot.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageSenderRunner 
//implements CommandLineRunner //commented because not using run(): this interface is used to executed the run method when the app starts
{

	@Autowired
	private JmsTemplate template;
	
//	@Scheduled(cron = "*/10 * * * * *") 
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		template.send("testMq1",ses -> ses.createTextMessage("From sender at "+new Date()));
//		System.out.println("Message Sent!");
//	}
//	the above method did not worked with @Scheduled annotation because @Scheduled only works with the no-args method.
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sendMessage() {
		template.send("testMq1",ses -> ses.createTextMessage("From sender at "+new Date()));
		System.out.println("Message Sent!");
	}
	
	

}
