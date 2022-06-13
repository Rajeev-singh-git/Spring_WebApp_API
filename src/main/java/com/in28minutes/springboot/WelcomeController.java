package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Creates Rest controller
public class WelcomeController {
	
	@Autowired //It inject bean created by Spring. Line no=21 (Creates an instance of class and Autowire it wherever needed.
	private WelcomeService service; //	private WelcomeService service = new  WelcomeService;
	
	@RequestMapping("/welcome") //maps the URL = http://localhost:8080/welcome
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
   
	
	@Component //creates instance of the class (beans)
	class WelcomeService{
		public String retrieveWelcomeMessage() {
			// Business logic, complex methods are written in service
			return "Good Morning!";
		}
	}

}
