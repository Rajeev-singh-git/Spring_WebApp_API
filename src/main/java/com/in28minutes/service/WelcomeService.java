package com.in28minutes.service;

import org.springframework.stereotype.Component;

@Component //creates instance of the class (beans)
public	class WelcomeService{
		public String retrieveWelcomeMessage() {
			// Business logic, complex methods are written in service
			return "Good Morning!";
		}
}