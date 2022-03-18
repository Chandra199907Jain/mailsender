package com.sending.sendingmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendingmailApplication {

	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SendingmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail()
	{
		service.sendSimpleEmail("chandrachoraria070@gmail.com","This is a test mail sent using Spring Boot Programming", "TestMail");
	}

}
