package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJms
public class ActiveMqJmsConsumerObjectPassingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMqJmsConsumerObjectPassingApplication.class, args);
	}

}
