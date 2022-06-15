package com.in28minutes.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.service.WelcomeService;


@RestController //Creates Rest controller
public class WelcomeController {
	
	@Autowired //It inject bean created by Spring.
	private WelcomeService service; //	private WelcomeService service = new  WelcomeService;
	
	@RequestMapping("/welcome") //maps the URL = http://localhost:8080/welcome
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
   

}
