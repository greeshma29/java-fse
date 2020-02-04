package com.cts.training.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");

// fetch the object
       IMessageService service = context.getBean("msgService", IMessageService.class);
       String ack = service.sendMessage("someone", "Hello");
       System.out.println(ack);
       
}
}