package com.in28minutes.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //creates instance of the class (beans)
public	class WelcomeService{
	
	@Value("${welcome.message}") //Autowires property value 
	private String welcomeMessage;
	
		public String retrieveWelcomeMessage() {
			// Business logic, complex methods are written in service
			return welcomeMessage;
		}
}